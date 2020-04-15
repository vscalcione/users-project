package it.intersistemi.springframework.todo.service.mapper;

import it.intersistemi.corso.gestioneAttivita.entity.Dipendente;
import it.intersistemi.corso.dto.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class DipendenteMapper implements EntityDtoMapper<EmployeeDto, Dipendente> {

	@Override
	public void entityToDto(Dipendente e, EmployeeDto dto) {
		dto.setIdMatricola(e.getIdMatricola());
		dto.setNome(e.getNome());
		dto.setCognome(e.getCognome());

	}

	@Override
	public void dtoToEntity(EmployeeDto dto, Dipendente e) {
		e.setIdMatricola(dto.getIdMatricola());
		e.setNome(dto.getNome());
		e.setCognome(dto.getCognome());
	}

	@Override
	public EmployeeDto createDtoInstance() {
		return new EmployeeDto();
	}

	@Override
	public Dipendente createEntityInstance() {
		return new Dipendente();
	}

}
