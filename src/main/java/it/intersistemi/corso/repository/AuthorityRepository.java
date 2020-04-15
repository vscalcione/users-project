package it.intersistemi.corso.repository;

import it.intersistemi.corso.dao.jpa.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, String> {

	Iterable<Authority> findByGroups_GroupName(String groupName);

	Iterable<Authority> findByUsers_UserName(String userName);

}
