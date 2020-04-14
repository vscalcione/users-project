package it.intersistemi.springframework.users.dao.jdbc.plain.mapper.service;

import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.model.AuthorityDto;
import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.model.GroupDto;
import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.model.UserDto;

import java.util.List;


public interface GroupService extends CrudService<GroupDto, String> {

	void addAuthority(String groupName, String authority);

	void removeAuthority(String groupName, String authority);

	List<AuthorityDto> listAuthorities(String groupName);

	void addUser(String groupName, String username);

	void removeUser(String groupName, String username);

	List<UserDto> listUsers(String groupName);

}
