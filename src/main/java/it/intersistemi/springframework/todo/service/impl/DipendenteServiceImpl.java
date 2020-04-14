package it.intersistemi.springframework.todo.service.impl;

import it.intersistemi.corso.gestioneAttivita.entity.Dipendente;
import it.intersistemi.springframework.todo.model.EmployeeDto;
import it.intersistemi.springframework.todo.repository.DipendenteRepository;
import it.intersistemi.springframework.todo.service.DipendenteService;
import it.intersistemi.springframework.todo.service.mapper.DipendenteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DipendenteServiceImpl
	extends AbstractCrudServiceJpaImpl<Dipendente, Integer, EmployeeDto, DipendenteRepository, DipendenteMapper>
	implements DipendenteService {

	@Autowired
	protected DipendenteServiceImpl(DipendenteRepository repository, DipendenteMapper mapper) {
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
