package it.intersistemi.springframework.usersboot.service;

import it.intersistemi.springframework.usersboot.model.AuthorityDto;
import it.intersistemi.springframework.usersboot.model.UserDto;

import java.util.List;


public interface UserService extends CrudService<UserDto, Integer> {

	UserDto findByUserName(String userName);

	void addAuthority(String userName, String authority);

	void removeAuthority(String userName, String authority);

	List<AuthorityDto> listAuthorities(String userName);

}
