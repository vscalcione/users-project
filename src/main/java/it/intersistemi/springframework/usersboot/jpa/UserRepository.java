package it.intersistemi.springframework.usersboot.jpa;

import it.intersistemi.springframework.usersboot.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByUserName(String userName);

	Iterable<User> findByGroupsGroupName(String groupName);
}
