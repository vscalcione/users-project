package it.intersistemi.springframework.mapper;

import it.intersistemi.springframework.dao.jpa.TodoList;
import it.intersistemi.springframework.dto.TodoDto;

public class TodoMapper implements EntityToDtoMapper<TodoDto, TodoList> {

	@Override
	public void entityToDto(TodoList e, TodoDto dto) {
		dto.setDescrizione(e.getDescrizione());
		dto.setIdAttivita(e.getIdAttivita());
		dto.setOrdineAttivita(e.getOrdineAttivita());
	}

	@Override
	public void dtoToEntity(TodoDto dto, TodoList e) {
		e.setDescrizione(dto.getDescrizione());
		e.setIdAttivita(dto.getIdAttivita());
		e.setOrdineAttivita(dto.getOrdineAttivita());
	}

	@Override
	public TodoDto createDtoInstance() {
		return new TodoDto();
	}

	@Override
	public TodoList createEntityInstance() {
		return new TodoList();
	}



}
