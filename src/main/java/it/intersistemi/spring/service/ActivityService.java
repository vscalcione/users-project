package it.intersistemi.spring.service;

import it.intersistemi.springframework.dao.ActivityDto;
import it.intersistemi.springframework.service.CrudService;

public interface ActivityService extends CrudService<ActivityDto, String> {

	public Iterable<ActivityDto> employeeActivitiesList(Integer idEmployee);

	public void assignEmployeeActivity(String idActivity, Integer idEmployee);

	public void removeEmployeeActivity(String idActivity, Integer idEmployee);

}
