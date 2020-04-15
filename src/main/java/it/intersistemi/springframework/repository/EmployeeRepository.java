package it.intersistemi.springframework.repository;

import it.intersistemi.springframework.dao.jpa.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Iterable<Employee> findByActivitiesIdActivity(String idActivity);

}
