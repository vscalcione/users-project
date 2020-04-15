package it.intersistemi.springframework.service.jpa;

import it.intersistemi.springframework.dao.jpa.Authority;
import it.intersistemi.springframework.dto.AuthorityDto;
import it.intersistemi.springframework.mapper.AuthorityMapper;
import it.intersistemi.springframework.repository.AuthorityRepository;
import it.intersistemi.springframework.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceJpaImpl
		extends AbstractCrudServiceJpaImpl<Authority, String, AuthorityDto, AuthorityRepository, AuthorityMapper>
		implements CrudService<AuthorityDto, String> {

	@Autowired
	public AuthorityServiceJpaImpl(AuthorityRepository repository, AuthorityMapper mapper) {
		super(repository, mapper);
	}

	@Override
	protected String getPK(Authority e) {
		return e.getAuthority();
	}

}
