package it.intersistemi.corso.repository;

import it.intersistemi.corso.entity.Activity;

public interface ActivityRepository extends CrudRepository<Activity, String>{

    Iterable<Activity> findByEmployeesEmployeeId(Integer idEmployee);

}
