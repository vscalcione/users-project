package it.intersistemi.springframework.repository;

import it.intersistemi.springframework.dao.jpa.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, String>{

	Iterable<Activity> findByEmployeesEmployeeId(Integer idEmployee);

}
