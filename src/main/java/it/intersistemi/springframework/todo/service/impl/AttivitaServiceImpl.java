package it.intersistemi.springframework.todo.service.impl;

import it.intersistemi.corso.gestioneAttivita.entity.Attivita;
import it.intersistemi.corso.gestioneAttivita.entity.Dipendente;
import it.intersistemi.corso.dto.ActivityDto;
import it.intersistemi.corso.repository.ActivityRepository;
import it.intersistemi.corso.repository.EmployeeRepository;
import it.intersistemi.springframework.todo.service.AttivitaService;
import it.intersistemi.springframework.todo.service.mapper.AttivitaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class AttivitaServiceImpl
	extends AbstractCrudServiceJpaImpl<Attivita, String, ActivityDto, ActivityRepository, AttivitaMapper>
	implements AttivitaService {

	@Autowired
	private EmployeeRepository dipendenteRepository;

	@Autowired
	protected AttivitaServiceImpl(ActivityRepository repository, AttivitaMapper mapper) {
		super(repository, mapper);
	}

	@Override
	protected String getPK(Attivita entity) {
		return entity.getIdAttivita();
	}

	@Transactional
	@Override
	public String insert(ActivityDto dto) {
		dto.setIdAttivita(UUID.randomUUID().toString());
		return super.insert(dto);
	}

	@Transactional
	@Override
	public Iterable<ActivityDto> listaAttivitaDipendente(Integer matrDipendente) {
		return super.mapper.entityToDto(super.repository.findByDipendentesIdMatricola(matrDipendente));
	}

	@Transactional
	@Override
	public void assegnaAttivitaDipendente(String idAttivita, Integer idMatricola) {
		Attivita attivita = super.repository.findById(idAttivita).orElse(null);
		if(attivita != null) {
			Dipendente dipendente = this.dipendenteRepository.findById(idMatricola).orElse(null);
			if(dipendente != null) {
				attivita.getDipendentes().add(dipendente);
				dipendente.getAttivitas().add(attivita);
			}
		}
	}

	@Transactional
	@Override
	public void rimuoviAttivitaDipendente(String idAttivita, Integer idMatricola) {
		Attivita attivita = super.repository.findById(idAttivita).orElse(null);
		if(attivita != null) {
			Dipendente dipendente = this.dipendenteRepository.findById(idMatricola).orElse(null);
			if(dipendente != null) {
				attivita.getDipendentes().remove(dipendente);
				dipendente.getAttivitas().remove(attivita);
			}
		}
	}
}
