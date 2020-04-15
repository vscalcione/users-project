package it.intersistemi.spring.service.mapper;

import it.intersistemi.corso.entity.Employee;
import it.intersistemi.corso.dto.EmployeeDto;
import it.intersistemi.springframework.todo.service.mapper.EntityDtoMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper implements EntityDtoMapper<it.intersistemi.corso.dao.EmployeeDto, Employee>{

    @Override
    public void entityToDto(Employee e, it.intersistemi.corso.dao.EmployeeDto dto) {
        dto.setIdEmployee(e.getIdEmployee());
        dto.setEmployeeName(e.getEmployeeName());
        dto.setEmployeeSurname(e.getEmployeeSurname());
    }

    @Override
    public void dtoToEntity(it.intersistemi.corso.dao.EmployeeDto dto, Employee e) {
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
