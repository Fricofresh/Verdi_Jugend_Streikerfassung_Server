package de.verdi.vjmuc_streik_server.db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.verdi.vjmuc_streik_server.db.model.StrikeUser;

public interface StrikeUserRepository extends CrudRepository<StrikeUser, Integer> {
	
	@Override
	List<StrikeUser> findAll();
	
	StrikeUser deleteById(int id);
}
