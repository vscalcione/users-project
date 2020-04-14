package it.intersistemi.springframework.todo.service.mapper;

import it.intersistemi.corso.gestioneAttivita.entity.Attivita;
import it.intersistemi.springframework.todo.model.AttivitaDto;
import org.springframework.stereotype.Component;

@Component
public class AttivitaMapper implements EntityDtoMapper<AttivitaDto, Attivita> {

	@Override
	public void entityToDto(Attivita e, AttivitaDto dto) {
		dto.setIdAttivita(e.getIdAttivita());
		dto.setNomeAttivita(e.getNomeAttivita());
		dto.setDataInizio(e.getDataInizio());
		dto.setDataFine(e.getDataFine());

	}

	@Override
	public void dtoToEntity(AttivitaDto dto, Attivita e) {
		e.setIdAttivita(dto.getIdAttivita());
		e.setNomeAttivita(dto.getNomeAttivita());
		e.setDataInizio(dto.getDataInizio());
		e.setDataFine(dto.getDataFine());
	}

	@Override
	public AttivitaDto createDtoInstance() {
		return new AttivitaDto();
	}

	@Override
	public Attivita createEntityInstance() {
		return new Attivita();
	}

}
