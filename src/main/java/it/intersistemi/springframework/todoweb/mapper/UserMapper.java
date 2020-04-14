package it.intersistemi.springframework.todoweb.mapper;

import it.intersistemi.springframework.todoweb.jpa.entity.User;
import it.intersistemi.springframework.todoweb.model.UserDTO;

public class UserMapper implements EntityToDtoMapper<UserDTO, User> {

	@Override
	public void entityToDto(User e, UserDTO dto) {
		dto.setUsername(e.getUsername());
		dto.setPassword(e.getPassword());
	}

	@Override
	public void dtoToEntity(UserDTO dto, User e) {
		e.setUsername(dto.getUsername());
		e.setPassword(dto.getPassword());
	}

	@Override
	public UserDTO createDtoInstance() {
		return new UserDTO();
	}

	@Override
	public User createEntityInstance() {
		return new User();
	}

}
