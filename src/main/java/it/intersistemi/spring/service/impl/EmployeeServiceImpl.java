package it.intersistemi.spring.service.impl;

import it.intersistemi.springframework.entity.Employee;
import it.intersistemi.springframework.dao.EmployeeDto;
import it.intersistemi.springframework.repository.EmployeeRepository;
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
