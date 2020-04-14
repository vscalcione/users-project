package it.intersistemi.springframework.todo.service.impl;

import it.intersistemi.corso.gestioneAttivita.entity.Attivita;
import it.intersistemi.corso.gestioneAttivita.entity.Dipendente;
import it.intersistemi.springframework.todo.model.AttivitaDto;
import it.intersistemi.springframework.todo.repository.AttivitaRepository;
import it.intersistemi.springframework.todo.repository.DipendenteRepository;
import it.intersistemi.springframework.todo.service.AttivitaService;
import it.intersistemi.springframework.todo.service.mapper.AttivitaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class AttivitaServiceImpl
	extends AbstractCrudServiceJpaImpl<Attivita, String, AttivitaDto, AttivitaRepository, AttivitaMapper>
	implements AttivitaService {

	@Autowired
	private DipendenteRepository dipendenteRepository;

	@Autowired
	protected AttivitaServiceImpl(AttivitaRepository repository, AttivitaMapper mapper) {
		super(repository, mapper);
	}

	@Override
	protected String getPK(Attivita entity) {
		return entity.getIdAttivita();
	}

	@Transactional
	@Override
	public String insert(AttivitaDto dto) {
		dto.setIdAttivita(UUID.randomUUID().toString());
		return super.insert(dto);
	}

	@Transactional
	@Override
	public Iterable<AttivitaDto> listaAttivitaDipendente(Integer matrDipendente) {
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
