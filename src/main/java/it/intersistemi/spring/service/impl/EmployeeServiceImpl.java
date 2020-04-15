package it.intersistemi.spring.service.impl;

import it.intersistemi.corso.entity.Employee;
import it.intersistemi.corso.dao.EmployeeDto;
import it.intersistemi.corso.repository.EmployeeRepository;
import it.intersistemi.springframework.todo.service.impl.AbstractCrudServiceJpaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends AbstractCrudServiceJpaImpl<Employee, Integer, EmployeeDto, EmployeeRepository, EmployeeMapper> implements EmployeeService {

    @Autowired
    protected EmployeeServiceImpl(EmployeeRepository repository, EmployeeMapper mapper) {
        super(repository, mapper);
    }

    @Override
    protected Integer getPK(Employee entity) {
        return entity.getIdEmployee();
    }

    @Override
    public Iterable<EmployeeDto> employeeActivitiesList(String idActivity) {
        return mapper.entityToDto(repository.findByActivitiesIdActivity(idActivity));
    }
