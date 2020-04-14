package it.intersistemi.springframework.users.service.jdbc.impl;

import it.intersistemi.springframework.users.dao.jdbc.AuthorityRepository;
import it.intersistemi.springframework.users.model.AuthorityDto;
import it.intersistemi.springframework.users.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceJdbcImpl
	extends AbstractCrudServiceJdbcImpl<AuthorityDto, String, AuthorityRepository>
	implements AuthorityService {

	@Autowired
	public AuthorityServiceJdbcImpl(AuthorityRepository repository) {
		super(repository);
	}

}
