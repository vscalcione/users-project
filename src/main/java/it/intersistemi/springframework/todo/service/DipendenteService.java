package it.intersistemi.springframework.todo.service;

import it.intersistemi.springframework.todo.model.EmployeeDto;

public interface DipendenteService extends CrudService<EmployeeDto, Integer> {

	Iterable<EmployeeDto> listaDipendentiAttivita(String idAttivita);

}
