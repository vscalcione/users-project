package it.intersistemi.springframework.dao.jdbc.plain.mapper.service.jdbc.impl;

import it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jdbc.GroupRepository;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.AuthorityDto;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.GroupDto;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.UserDto;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupServiceJdbcImpl
	extends AbstractCrudServiceJdbcImpl<GroupDto, String, GroupRepository>
	implements GroupService {

	@Autowired
	public GroupServiceJdbcImpl(GroupRepository repository) {
		super(repository);
	}

	@Transactional
	@Override
	public void addAuthority(String groupName, String authority) {
		super.repository.addAuthority(groupName, authority);
	}

	@Transactional
	@Override
	public void removeAuthority(String groupName, String authority) {
		super.repository.removeAuthority(groupName, authority);
	}

	@Transactional
	@Override
	public List<AuthorityDto> listAuthorities(String groupName) {
		return super.repository.listAuthorities(groupName);
	}

	@Transactional
	@Override
	public void addUser(String groupName, String username) {
		super.repository.addUser(groupName, username);
	}

	@Transactional
	@Override
	public void removeUser(String groupName, String username) {
		super.repository.removeUser(groupName, username);
	}

	@Transactional
	@Override
	public List<UserDto> listUsers(String groupName) {
		return super.repository.listUsers(groupName);
	}

}
