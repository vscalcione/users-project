package it.intersistemi.springframework.dao.jdbc.plain.mapper.service.jpa.mapper;

import it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jpa.entity.Group;
import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.GroupDto;
import org.springframework.stereotype.Component;

@Component
public class GroupMapper implements EntityDtoMapper<GroupDto, Group> {

	@Override
	public void dtoToEntity(GroupDto dto, Group e) {
		e.setGroupName(dto.getGroupName());
		e.setDescription(dto.getDescription());
	}

	@Override
	public Group createEntityInstance() {
		return new Group();
	}

	@Override
	public void entityToDto(Group e, GroupDto dto) {
		dto.setGroupName(e.getGroupName());
		dto.setDescription(e.getDescription());
	}

	@Override
	public GroupDto createDtoInstance() {
		return new GroupDto();
	}

}
