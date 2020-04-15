package it.intersistemi.springframework.dao.jdbc;

import it.intersistemi.springframework.dto.AuthorityDto;
import it.intersistemi.springframework.dto.UserDto;

import java.util.List;


public interface UserRepository extends CrudRepository<UserDto, Integer> {

	void addAuthority(String userName, String authority);

	void removeAuthority(String userName, String authority);

	List<AuthorityDto> listAuthorities(String userName);

}
