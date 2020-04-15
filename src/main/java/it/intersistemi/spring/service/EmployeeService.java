package it.intersistemi.spring.service;

import it.intersistemi.springframework.service.CrudService;
import it.intersistemi.springframework.dto.EmployeeDto;

public interface EmployeeService extends CrudService<EmployeeDto, Integer> {

	Iterable<EmployeeDto> employeeActivitiesList(String idActivity);

}
