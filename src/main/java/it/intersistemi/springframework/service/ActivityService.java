package it.intersistemi.springframework.service;

import it.intersistemi.springframework.dto.ActivityDto;

public interface ActivityService extends CrudService<ActivityDto, String> {

	public Iterable<ActivityDto> employeeActivitiesList(Integer idEmployee);

	public void assignEmployeeActivity(String idActivity, Integer idEmployee);

	public void removeEmployeeActivity(String idActivity, Integer idEmployee);

}
