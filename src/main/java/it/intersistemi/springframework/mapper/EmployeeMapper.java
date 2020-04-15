package it.intersistemi.springframework.mapper;

import it.intersistemi.springframework.dao.jpa.Employee;
import it.intersistemi.springframework.dto.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper implements EntityDtoMapper<EmployeeDto, Employee> {

	@Override
	public void entityToDto(Employee e, EmployeeDto dto) {
		dto.setIdEmployee(e.getIdEmployee());
		dto.setEmployeeName(e.getEmployeeName());
		dto.setEmployeeSurname(e.getEmployeeSurname());
	}

	@Override
	public void dtoToEntity(EmployeeDto dto, Employee e) {
		e.setIdEmployee(dto.getIdEmployee());
		e.setEmployeeName(dto.getEmployeeName());
		e.setEmployeeSurname(dto.getEmployeeSurname());
	}

	@Override
	public EmployeeDto createDtoInstance() {
		return new EmployeeDto();
	}

	@Override
	public Employee createEntityInstance() {
		return new Employee();
	}
}

