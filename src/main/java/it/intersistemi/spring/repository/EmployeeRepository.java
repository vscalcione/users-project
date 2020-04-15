package it.intersistemi.spring.repository;

import it.intersistemi.springframework.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Iterable<Employee> findByActivitiesIdActivity(String idActivity);

}
