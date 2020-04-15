package it.intersistemi.springframework.service.jpa;

import it.intersistemi.springframework.gestioneAttivita.entity.Dipendente;
import it.intersistemi.springframework.dto.EmployeeDto;
import it.intersistemi.springframework.repository.EmployeeRepository;
import it.intersistemi.springframework.service.EmployeeService;
import it.intersistemi.springframework.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl
	extends AbstractCrudServiceJpaImpl<Dipendente, Integer, EmployeeDto, EmployeeRepository, EmployeeMapper>
	implements EmployeeService {

	@Autowired
	protected EmployeeServiceImpl(EmployeeRepository repository, EmployeeMapper mapper) {
		super(repository, mapper);
	}

	@Override
	protected Integer getPK(Dipendente entity) {
		return entity.getIdMatricola();
	}

	@Override
	public Iterable<EmployeeDto> listaDipendentiAttivita(String idAttivita) {
		return mapper.entityToDto(repository.findByAttivitasIdAttivita(idAttivita));
	}

}
