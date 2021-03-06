//package it.intersistemi.springframework.service.jpa;
//
//import it.intersistemi.springframework.dao.jpa.Activity;
//import it.intersistemi.springframework.dao.jpa.Employee;
//import it.intersistemi.springframework.dto.ActivityDto;
//import it.intersistemi.springframework.mapper.ActivityMapper;
//import it.intersistemi.springframework.repository.ActivityRepository;
//import it.intersistemi.springframework.repository.EmployeeRepository;
//import it.intersistemi.springframework.service.ActivityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.UUID;
//
//@Service
//public class ActivityServiceImpl extends AbstractCrudServiceJpaImpl<Activity, String, ActivityDto, ActivityRepository, ActivityMapper>
//		implements ActivityService {
//
//	@Autowired
//	private EmployeeRepository employeeRepository;
//
//	@Autowired
//	protected ActivityServiceImpl(ActivityRepository repository, ActivityMapper mapper) {
//		super(repository, mapper);
//	}
//
//	@Override
//	protected String getPK(Activity entity) {
//		return entity.getIdActivity();
//	}
//
//	@Transactional
//	@Override
//	public String insert(ActivityDto dto) {
//		dto.setIdActivity(UUID.randomUUID().toString());
//		return super.insert(dto);
//	}
//
//	@Transactional
//	@Override
//	public Iterable<ActivityDto> listaAttivitaDipendente(Integer idEmployee) {
//		return super.mapper.entityToDto(super.repository.findByEmployeesEmployeeId(idEmployee));
//	}
//
//	@Transactional
//	@Override
//	public void assegnaAttivitaDipendente(String idActivity, Integer idEmployee) {
//		Activity activity = super.repository.findById(idActivity).orElse(null);
//		if(activity != null) {
//			Employee employee = this.employeeRepository.findById(idEmployee).orElse(null);
//			if(employee != null) {
//				activity.getEmployees().add(employee);
//				((Employee) employee).getActivities().add(activity);
//			}
//		}
//	}
//
//	@Transactional
//	@Override
//	public void rimuoviAttivitaDipendente(String idActivity, Integer idEmployee) {
//		Activity activity = super.repository.findById(idActivity).orElse(null);
//		if(activity != null) {
//			Employee employee = this.employeeRepository.findById(idEmployee).orElse(null);
//			if(employee != null) {
//				activity.getEmployees().remove(employee);
//				employee.getActivities().remove(activity);
//			}
//		}
//	}
//}
