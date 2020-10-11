package de.verdi.vjmuc_streik_server.db.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.verdi.vjmuc_streik_server.db.model.UserModel;

public interface StrikeUserRepository extends CrudRepository<UserModel, Integer> {
	
	@Override
	List<UserModel> findAll();
	
	UserModel deleteById(int id);
}
