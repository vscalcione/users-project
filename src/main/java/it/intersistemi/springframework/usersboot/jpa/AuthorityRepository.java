package it.intersistemi.springframework.usersboot.jpa;

import it.intersistemi.springframework.usersboot.jpa.entity.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, String> {

	Iterable<Authority> findByGroups_GroupName(String groupName);

	Iterable<Authority> findByUsers_UserName(String userName);

}
