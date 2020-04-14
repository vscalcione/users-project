package it.intersistemi.corso.repository;

import it.intersistemi.corso.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Iterable<Employee> findByActivitiesIdActivity(String idActivity);

}
