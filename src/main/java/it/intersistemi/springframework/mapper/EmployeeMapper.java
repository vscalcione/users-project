package it.intersistemi.springframework.mapper;

import it.intersistemi.springframework.gestioneAttivita.entity.Dipendente;
import it.intersistemi.springframework.dto.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper implements EntityDtoMapper<EmployeeDto, Dipendente> {

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
