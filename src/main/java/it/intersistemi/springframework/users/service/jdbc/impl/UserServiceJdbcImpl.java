package it.intersistemi.springframework.users.service.jdbc.impl;

import it.intersistemi.springframework.users.dao.jdbc.UserRepository;
import it.intersistemi.springframework.users.model.AuthorityDto;
import it.intersistemi.springframework.users.model.UserDto;
import it.intersistemi.springframework.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceJdbcImpl
	extends AbstractCrudServiceJdbcImpl<UserDto, Integer, UserRepository>
	implements UserService {

	@Autowired
	public UserServiceJdbcImpl(UserRepository repository) {
		super(repository);
	}

	@Override
	public UserDto findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void addAuthority(String userName, String authority) {
		super.repository.addAuthority(userName, authority);
	}

	@Transactional
	@Override
	public void removeAuthority(String userName, String authority) {
		super.repository.removeAuthority(userName, authority);
	}

	@Transactional
	@Override
	public List<AuthorityDto> listAuthorities(String userName) {
		return super.repository.listAuthorities(userName);
	}

}
