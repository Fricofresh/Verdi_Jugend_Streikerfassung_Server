package de.verdi.vjmuc_streik_server.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.verdi.vjmuc_streik_server.db.model.StrikeUser;
import de.verdi.vjmuc_streik_server.db.service.StrikeUserService;
import de.verdi.vjmuc_streik_server.ws.model.RestUserData;

@RestController
public class RestService {
	
	@Autowired
	private StrikeUserService strikeUserService;
	
	@PostMapping
	@RequestMapping("/users")
	public List<StrikeUser> newUsers(@RequestBody List<RestUserData> restUserData) {
		
		List<StrikeUser> result = new ArrayList<>();
		for (RestUserData restUser : restUserData) {
			Optional<StrikeUser> addStrikeUser = strikeUserService.addStrikeUser(restUser);
			addStrikeUser.ifPresent(result::add);
		}
		if (result.isEmpty()) {
			return null;
		}
		return result;
	}
	
	@GetMapping
	@RequestMapping("/users/all")
	public void getUsers() {
		
		System.out.println("Rippchen");
	}
}
