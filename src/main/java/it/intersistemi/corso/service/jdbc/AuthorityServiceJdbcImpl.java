package it.intersistemi.corso.service.jdbc;

import it.intersistemi.springframework.users.dao.jdbc.AuthorityRepository;
import it.intersistemi.springframework.users.model.AuthorityDto;
import it.intersistemi.springframework.users.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceJdbcImpl
	extends AbstractCrudServiceJdbcImpl<AuthorityDto, String, AuthorityRepository>
	implements CrudService<AuthorityDto, String> {

	@Autowired
	public AuthorityServiceJdbcImpl(AuthorityRepository repository) {
		super(repository);
	}

}
