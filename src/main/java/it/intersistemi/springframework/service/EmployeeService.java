package it.intersistemi.springframework.service;

import it.intersistemi.springframework.dto.EmployeeDto;

public interface EmployeeService extends CrudService<EmployeeDto, Integer> {

	Iterable<EmployeeDto> employeesActivityList(String idActivity);

}
