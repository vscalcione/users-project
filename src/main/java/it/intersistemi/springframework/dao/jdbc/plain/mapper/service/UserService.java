package it.intersistemi.springframework.dao.jdbc.plain.mapper.service;

import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.AuthorityDto;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.UserDto;

import java.util.List;


public interface UserService extends CrudService<UserDto, Integer> {

	UserDto findByUserName(String userName);

	void addAuthority(String userName, String authority);

	void removeAuthority(String userName, String authority);

	List<AuthorityDto> listAuthorities(String userName);

}
