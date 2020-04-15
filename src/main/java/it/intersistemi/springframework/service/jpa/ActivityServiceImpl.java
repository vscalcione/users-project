package it.intersistemi.springframework.service.jpa;

import it.intersistemi.springframework.gestioneAttivita.entity.Attivita;
import it.intersistemi.springframework.gestioneAttivita.entity.Dipendente;
import it.intersistemi.springframework.dto.ActivityDto;
import it.intersistemi.springframework.repository.ActivityRepository;
import it.intersistemi.springframework.repository.EmployeeRepository;
import it.intersistemi.springframework.service.ActivityService;
import it.intersistemi.springframework.mapper.ActivityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class ActivityServiceImpl
	extends AbstractCrudServiceJpaImpl<Attivita, String, ActivityDto, ActivityRepository, ActivityMapper>
	implements ActivityService {

	@Autowired
	private EmployeeRepository dipendenteRepository;

	@Autowired
	protected ActivityServiceImpl(ActivityRepository repository, ActivityMapper mapper) {
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
