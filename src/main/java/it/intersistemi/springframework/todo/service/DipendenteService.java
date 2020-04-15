package it.intersistemi.springframework.todo.service;

import it.intersistemi.corso.dto.EmployeeDto;

public interface DipendenteService extends CrudService<EmployeeDto, Integer> {

	Iterable<EmployeeDto> listaDipendentiAttivita(String idAttivita);

}
