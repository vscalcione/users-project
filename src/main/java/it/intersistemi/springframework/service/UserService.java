package it.intersistemi.springframework.service;


import it.intersistemi.springframework.dto.AuthorityDto;
import it.intersistemi.springframework.dto.UserDto;

import java.util.List;

public interface UserService extends CrudService<UserDto, Integer> {

	UserDto findByUserName(String userName);

	void addAuthority(String userName, String authority);

	void removeAuthority(String userName, String authority);

	List<AuthorityDto> listAuthorities(String userName);

}
