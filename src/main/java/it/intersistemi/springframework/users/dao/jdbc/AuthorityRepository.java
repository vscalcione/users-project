package it.intersistemi.springframework.users.dao.jdbc;

import it.intersistemi.springframework.users.model.AuthorityDto;

public interface AuthorityRepository extends CrudRepository<AuthorityDto, String> {

}
