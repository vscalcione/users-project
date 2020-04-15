package it.intersistemi.springframework.mapper;

import it.intersistemi.springframework.dao.jpa.User;
import it.intersistemi.springframework.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements EntityDtoMapper<UserDto, User> {

	@Override
	public void dtoToEntity(UserDto dto, User e) {
		if(dto.getUserId() != null) {
			e.setUserId(dto.getUserId());
		}
		e.setUserName(dto.getUserName());
		e.setPassword(dto.getPassword());
		e.setEnabled(dto.isEnabled());
	}

	@Override
	public User createEntityInstance() {
		return new User();
	}

	@Override
	public void entityToDto(User e, UserDto dto) {
		dto.setUserId(e.getUserId());
		dto.setUserName(e.getUserName());
		dto.setPassword(e.getPassword());
		dto.setEnabled(e.getEnabled());
	}

	@Override
	public UserDto createDtoInstance() {
		return new UserDto();
	}

}
