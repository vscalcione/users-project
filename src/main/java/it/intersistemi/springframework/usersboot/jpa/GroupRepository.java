package it.intersistemi.springframework.usersboot.jpa;

import it.intersistemi.springframework.usersboot.jpa.entity.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, String> {

}
