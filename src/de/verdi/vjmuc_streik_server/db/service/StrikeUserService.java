package de.verdi.vjmuc_streik_server.db.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.verdi.vjmuc_streik_server.db.model.StrikeUser;
import de.verdi.vjmuc_streik_server.db.repository.StrikeUserRepository;
import de.verdi.vjmuc_streik_server.ws.model.RestUserData;

@Service
public class StrikeUserService {
	
	@Autowired
	private StrikeUserRepository strikeUserRepository;
	
	public Optional<StrikeUser> addStrikeUser(RestUserData restUserData) {
		
		if (restUserData == null)
			return null;
		
		StrikeUser strikeUser = new StrikeUser();
		
		if (!StringUtils.isEmpty(restUserData.getAccountDetail())) {
			String accountDataJson = restUserData.getAccountDetail();
			Map<String, String> jsonMap = getJsonValues(accountDataJson);
			strikeUser.setiBAN(jsonMap.get("iban"));
			strikeUser.setBIC(jsonMap.get("bic"));
			
		}
		strikeUser.setIsNewMember(Boolean.valueOf(restUserData.getBecomeMember()));
		strikeUser.setChildrens(Optional.ofNullable(restUserData.getChildBenefit()).map(Integer::valueOf).orElse(null));
		strikeUser.setCompanyName(restUserData.getCompany());
		strikeUser.setIsStrikingAlone(!Boolean.valueOf(restUserData.getCoPartner()));
		strikeUser.setCurrentSalary(
				Optional.ofNullable(restUserData.getCurrentSalary()).map(Double::valueOf).orElse(null));
		
		if (!StringUtils.isEmpty(restUserData.getGenerallSalaryData())) {
			String generalSalaryData = restUserData.getGenerallSalaryData();
			Map<String, String> jsonMap = getJsonValues(generalSalaryData);
			strikeUser.setIsAzubi(Boolean.valueOf(jsonMap.get("isazubi")));
			strikeUser.setTraineeProfession(jsonMap.get("ausbildung"));
			strikeUser.setYearOfTraining(
					Optional.ofNullable(jsonMap.get("ausbildungsjahr")).map(Integer::valueOf).orElse(null));
			strikeUser.setPaymentLevel(jsonMap.get("endgeldgruppe"));
		}
		
		strikeUser.setLostWorkingHours(
				Optional.ofNullable(restUserData.getLostWorkingHours()).map(Double::valueOf).orElse(null));
		strikeUser.setMembershipNumber(
				Optional.ofNullable(restUserData.getMembershipNumber()).map(Long::valueOf).orElse(null));
		
		if (!StringUtils.isEmpty(restUserData.getPersonalDetails())) {
			String personalDetailsJson = restUserData.getPersonalDetails();
			Map<String, String> jsonMap = getJsonValues(personalDetailsJson);
			strikeUser.setForename(jsonMap.get("forename"));
			strikeUser.setSurname(jsonMap.get("surname"));
			String bithdayString = jsonMap.get("birthday");
			if (StringUtils.isEmpty(bithdayString))
				strikeUser.setBirthday(Optional.ofNullable(bithdayString).map(LocalDate::parse).orElse(null));
			strikeUser.setEMail(jsonMap.get("email"));
		}
		
		strikeUser.setUseKnownAccountData(Boolean.valueOf(restUserData.getStrikePay()));
		strikeUser.setIsNewMember(Boolean.valueOf(restUserData.getWantBecomeMember()));
		strikeUser
				.setWorkingHours(Optional.ofNullable(restUserData.getWorkingHours()).map(Double::valueOf).orElse(null));
		
		Optional<StrikeUser> result = Optional.ofNullable(strikeUserRepository.save(strikeUser));
		return result;
	}
	
	private Map<String, String> getJsonValues(String json) {
		
		try {
			return new ObjectMapper().readValue(json, HashMap.class);
		}
		catch (JsonProcessingException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return null;
	}
}
