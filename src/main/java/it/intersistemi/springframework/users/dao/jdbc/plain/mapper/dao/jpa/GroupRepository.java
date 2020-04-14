package it.intersistemi.springframework.users.dao.jdbc.plain.mapper.dao.jpa;

import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.dao.jpa.entity.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, String> {

}
