package it.intersistemi.springframework.users.dao.jdbc;

import it.intersistemi.springframework.users.model.AuthorityDto;
import it.intersistemi.springframework.users.model.UserDto;

import java.util.List;


public interface UserRepository extends CrudRepository<UserDto, Integer> {

	void addAuthority(String userName, String authority);

	void removeAuthority(String userName, String authority);

	List<AuthorityDto> listAuthorities(String userName);

}
