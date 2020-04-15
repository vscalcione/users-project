package it.intersistemi.corso.service.jpa;

import it.intersistemi.corso.repository.AuthorityRepository;
import it.intersistemi.corso.model.entity.jpa.Authority;
import it.intersistemi.corso.dto.AuthorityDto;
import it.intersistemi.corso.service.AuthorityService;
import it.intersistemi.corso.mapper.AuthorityMapper;
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
