package it.intersistemi.spring.service.impl;

import it.intersistemi.corso.entity.Activity;
import it.intersistemi.corso.entity.Employee;
import it.intersistemi.corso.dao.ActivityDto;
import it.intersistemi.corso.repository.ActivityRepository;
import it.intersistemi.corso.repository.EmployeeRepository;
import it.intersistemi.springframework.todo.service.impl.AbstractCrudServiceJpaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class ActivityServiceImpl extends AbstractCrudServiceJpaImpl<Activity, String, ActivityDto, ActivityRepository, ActivityMapper> implements ActivityService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    protected ActivityServiceImpl(ActivityRepository repository, ActivityMapper mapper) {
        super(repository, mapper);
    }

    @Override
    protected String getPK(Activity entity) {
        return entity.getIdActivity();
    }

    @Transactional
    @Override
    public String insert(ActivityDto dto) {
        dto.setIdActivity(UUID.randomUUID().toString());
        return super.insert(dto);
    }

    @Transactional
    @Override
    public Iterable<ActivityDto> listaAttivitaDipendente(Integer idEmployee) {
        return super.mapper.entityToDto(super.repository.findByEmployeesEmployeeId(idEmployee));
    }

    @Transactional
    @Override
    public void assegnaAttivitaDipendente(String idActivity, Integer idEmployee) {
        Activity activity = super.repository.findById(idActivity).orElse(null);
        if(activity != null) {
            Employee employee = this.employeeRepository.findById(idEmployee).orElse(null);
            if(employee != null) {
                activity.getEmployees().add(employee);
                ((Employee) employee).getActivities().add(activity);
            }
        }
    }

    @Transactional
    @Override
    public void rimuoviAttivitaDipendente(String idActivity, Integer idEmployee) {
        Activity activity = super.repository.findById(idActivity).orElse(null);
        if(activity != null) {
            Employee employee = this.employeeRepository.findById(idEmployee).orElse(null);
            if(employee != null) {
                activity.getEmployees().remove(employee);
                employee.getActivities().remove(activity);
            }
        }
    }
}
