package de.verdi.vjmuc_streik_server.db.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.verdi.vjmuc_streik_server.db.model.UserModel;
import de.verdi.vjmuc_streik_server.db.repository.StrikeUserRepository;

@Service
public class StrikeUserService {
	
	@Autowired
	private StrikeUserRepository strikeUserRepository;
	
	/**
	 * Saves a StrikeUser to the Database
	 * 
	 * @return null if StrikeUser = null
	 */
	public Optional<UserModel> addStrikeUser(UserModel strikeUser) {
		
		if (strikeUser == null)
			return null;
		
		Optional<UserModel> result = Optional.ofNullable(strikeUserRepository.save(strikeUser));
		return result;
	}
	
	public List<UserModel> getAllUsers() {
		
		List<UserModel> strikeUsers = strikeUserRepository.findAll();
		return strikeUsers;
	}
	
	@SuppressWarnings("Nur zur Testzwecke")
	public UserModel _removeUser(int id) {
		
		return strikeUserRepository.deleteById(id);
	}
}
