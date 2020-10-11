package de.verdi.vjmuc_streik_server.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

import de.verdi.vjmuc_streik_server.db.model.UserModel;
import de.verdi.vjmuc_streik_server.db.service.StrikeUserService;

@RestController
@RequestMapping("/v1")
public class RestService {
	
	private Log logger = LogFactory.getLog(RestService.class);
	
	@Autowired
	private StrikeUserService strikeUserService;
	
	@PostMapping("/users")
	public List<UserModel> newUsers(@RequestBody List<UserModel> restUserData) {
		
		logger.info("Neuer Post Request /users");
		List<UserModel> result = new ArrayList<>();
		for (UserModel restUser : restUserData) {
			Optional<UserModel> addStrikeUser = strikeUserService.addStrikeUser(restUser);
			addStrikeUser.ifPresent(result::add);
		}
		if (result.isEmpty()) {
			return null;
		}
		return result;
	}
	
	@GetMapping("/users/all")
	public List<UserModel> getUsers() {
		
		logger.info("Neuer Post Request /users/all");
		return strikeUserService.getAllUsers();
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<UserModel> removeUser(int id) {
		
		logger.info("Neuer Post Request /users/" + id);
		try {
			return new ResponseEntity<UserModel>(strikeUserService._removeUser(id), HttpStatus.OK);
		}
		catch (EmptyResultDataAccessException e) {
			return new ResponseEntity<UserModel>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/info")
	public String info() {
		
		logger.info("Neuer Post Request /info");
		
		return "Server is running";
	}
}
