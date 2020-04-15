package it.intersistemi.springframework.repository;

import it.intersistemi.springframework.dao.jpa.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, String> {

}
