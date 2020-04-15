package it.intersistemi.springframework.todo.service.mapper;

import it.intersistemi.corso.gestioneAttivita.entity.Attivita;
import it.intersistemi.corso.dto.ActivityDto;
import org.springframework.stereotype.Component;

@Component
public class AttivitaMapper implements EntityDtoMapper<ActivityDto, Attivita> {

	@Override
	public void entityToDto(Attivita e, ActivityDto dto) {
		dto.setIdAttivita(e.getIdAttivita());
		dto.setNomeAttivita(e.getNomeAttivita());
		dto.setDataInizio(e.getDataInizio());
		dto.setDataFine(e.getDataFine());

	}

	@Override
	public void dtoToEntity(ActivityDto dto, Attivita e) {
		e.setIdAttivita(dto.getIdAttivita());
		e.setNomeAttivita(dto.getNomeAttivita());
		e.setDataInizio(dto.getDataInizio());
		e.setDataFine(dto.getDataFine());
	}

	@Override
	public ActivityDto createDtoInstance() {
		return new ActivityDto();
	}

	@Override
	public Attivita createEntityInstance() {
		return new Attivita();
	}

}
