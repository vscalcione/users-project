package it.intersistemi.spring.service;

import it.intersistemi.corso.service.CrudService;
import it.intersistemi.corso.dto.EmployeeDto;

public interface EmployeeService extends CrudService<EmployeeDto, Integer> {

	Iterable<EmployeeDto> employeeActivitiesList(String idActivity);

}
