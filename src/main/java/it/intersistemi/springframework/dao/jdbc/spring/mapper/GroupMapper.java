package it.intersistemi.springframework.dao.jdbc.spring.mapper;

import it.intersistemi.springframework.users.model.GroupDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

public class GroupMapper implements RowMapper<GroupDto> {

	public GroupDto mapRow(ResultSet rs, int rowNum) throws java.sql.SQLException {
		GroupDto entity = new GroupDto();
		// Estrarre i valori dal resultset
		entity.setGroupName(rs.getString("GROUP_NAME"));
		entity.setDescription(rs.getString("DESCRIPTION"));
		return entity;
	}

}
