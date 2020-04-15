package it.intersistemi.springframework.dao.jpa;

import it.intersistemi.springframework.dao.jpa.entity.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, String> {

}
