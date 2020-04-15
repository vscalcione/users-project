package it.intersistemi.corso.repository;

import it.intersistemi.corso.dao.jpa.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, String> {

}
