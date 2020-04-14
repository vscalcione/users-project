package it.intersistemi.springframework.users.dao.jdbc.plain.mapper.service.jpa.impl;

import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.dao.jpa.AuthorityRepository;
import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.dao.jpa.entity.Authority;
import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.model.AuthorityDto;
import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.service.AuthorityService;
import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.service.jpa.mapper.AuthorityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceJpaImpl
	extends AbstractCrudServiceJpaImpl<Authority, String, AuthorityDto, AuthorityRepository, AuthorityMapper>
	implements AuthorityService {

	@Autowired
	public AuthorityServiceJpaImpl(AuthorityRepository repository, AuthorityMapper mapper) {
		super(repository, mapper);
	}

	@Override
	protected String getPK(Authority e) {
		return e.getAuthority();
	}

}
