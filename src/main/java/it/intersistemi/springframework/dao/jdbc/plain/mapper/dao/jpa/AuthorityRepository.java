package it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jpa;

import it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jpa.entity.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, String> {

	Iterable<Authority> findByGroups_GroupName(String groupName);

	Iterable<Authority> findByUsers_UserName(String userName);

}
