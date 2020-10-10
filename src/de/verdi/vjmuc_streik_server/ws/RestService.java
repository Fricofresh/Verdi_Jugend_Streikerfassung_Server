package de.verdi.vjmuc_streik_server.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.verdi.vjmuc_streik_server.db.model.StrikeUser;
import de.verdi.vjmuc_streik_server.db.service.StrikeUserService;

@RestController
@RequestMapping("/v1")
public class RestService {
	
	@Autowired
	private StrikeUserService strikeUserService;
	
	@PostMapping("/users")
	public List<StrikeUser> newUsers(@RequestBody List<StrikeUser> restUserData) {
		
		List<StrikeUser> result = new ArrayList<>();
		for (StrikeUser restUser : restUserData) {
			Optional<StrikeUser> addStrikeUser = strikeUserService.addStrikeUser(restUser);
			addStrikeUser.ifPresent(result::add);
		}
		if (result.isEmpty()) {
			return null;
		}
		return result;
	}
	
	@GetMapping("/users/all")
	public List<StrikeUser> getUsers() {
		
		return strikeUserService.getAllUsers();
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<StrikeUser> removeUser(int id) {
		
		try {
			return new ResponseEntity<StrikeUser>(strikeUserService._removeUser(id), HttpStatus.OK);
		}
		catch (EmptyResultDataAccessException e) {
			return new ResponseEntity<StrikeUser>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/info")
	public String info() {
		
		return "Server is running";
	}
}
