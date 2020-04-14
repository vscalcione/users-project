package it.intersistemi.springframework.usersboot.service.jpa.mapper;

import it.intersistemi.springframework.usersboot.jpa.entity.Authority;
import it.intersistemi.springframework.usersboot.model.AuthorityDto;
import org.springframework.stereotype.Component;

@Component
public class AuthorityMapper implements EntityDtoMapper<AuthorityDto, Authority> {

	@Override
	public void dtoToEntity(AuthorityDto dto, Authority e) {
		e.setAuthority(dto.getAuthority());
		e.setDescription(dto.getDescription());
	}

	@Override
	public Authority createEntityInstance() {
		return new Authority();
	}

	@Override
	public void entityToDto(Authority e, AuthorityDto dto) {
		dto.setAuthority(e.getAuthority());
		dto.setDescription(e.getDescription());
	}

	@Override
	public AuthorityDto createDtoInstance() {
		return new AuthorityDto();
	}

}
