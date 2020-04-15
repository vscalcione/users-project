package it.intersistemi.springframework.mapper;

import it.intersistemi.springframework.dao.jpa.User_dacontrollare;

public class UserMapper_dacontrollare implements EntityToDtoMapper<UserDTO, User_dacontrollare> {

	@Override
	public void entityToDto(User_dacontrollare e, UserDTO dto) {
		dto.setUsername(e.getUsername());
		dto.setPassword(e.getPassword());
	}

	@Override
	public void dtoToEntity(UserDTO dto, User_dacontrollare e) {
		e.setUsername(dto.getUsername());
		e.setPassword(dto.getPassword());
	}

	@Override
	public UserDTO createDtoInstance() {
		return new UserDTO();
	}

	@Override
	public User_dacontrollare createEntityInstance() {
		return new User_dacontrollare();
	}

}
