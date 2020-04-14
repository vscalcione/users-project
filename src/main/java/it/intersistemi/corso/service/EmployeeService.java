package it.intersistemi.corso.service;

import it.intersistemi.springframework.todo.model.EmployeeDto;

public interface EmployeeService extends CrudService<EmployeeDto, Integer> {

	Iterable<EmployeeDto> employeeActivitiesList(String idActivity);

}
