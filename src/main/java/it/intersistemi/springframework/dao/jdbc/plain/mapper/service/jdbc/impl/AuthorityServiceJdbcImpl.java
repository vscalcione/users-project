package it.intersistemi.springframework.dao.jdbc.plain.mapper.service.jdbc.impl;

import it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jdbc.AuthorityRepository;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.AuthorityDto;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.service.AuthorityService;
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
