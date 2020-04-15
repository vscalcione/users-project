package it.intersistemi.spring.repository;

import it.intersistemi.springframework.entity.Activity;

public interface ActivityRepository extends CrudRepository<Activity, String>{

    Iterable<Activity> findByEmployeesEmployeeId(Integer idEmployee);

}
