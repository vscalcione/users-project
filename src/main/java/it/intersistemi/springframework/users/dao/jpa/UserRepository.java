package it.intersistemi.springframework.users.dao.jpa;

import it.intersistemi.springframework.users.dao.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByUserName(String userName);

	Iterable<User> findByGroupsGroupName(String groupName);
}
