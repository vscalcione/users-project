package it.intersistemi.spring.service.mapper;

import it.intersistemi.springframework.entity.Employee;
import it.intersistemi.springframework.dto.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper implements EntityDtoMapper<it.intersistemi.springframework.dao.EmployeeDto, Employee>{

    @Override
    public void entityToDto(Employee e, it.intersistemi.springframework.dao.EmployeeDto dto) {
        dto.setIdEmployee(e.getIdEmployee());
        dto.setEmployeeName(e.getEmployeeName());
        dto.setEmployeeSurname(e.getEmployeeSurname());
    }

    @Override
    public void dtoToEntity(it.intersistemi.springframework.dao.EmployeeDto dto, Employee e) {
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
