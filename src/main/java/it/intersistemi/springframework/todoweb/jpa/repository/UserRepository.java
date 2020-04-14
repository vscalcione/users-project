package it.intersistemi.springframework.todoweb.jpa.repository;

import it.intersistemi.springframework.todoweb.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
