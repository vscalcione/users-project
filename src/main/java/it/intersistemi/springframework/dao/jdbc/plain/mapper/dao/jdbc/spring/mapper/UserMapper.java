package it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jdbc.spring.mapper;

import it.intersistemi.springframework.dao.jdbc.plain.mapper.model.UserDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

public class UserMapper implements RowMapper<UserDto> {

	public UserDto mapRow(ResultSet rs, int rowNum) throws java.sql.SQLException {
		UserDto entity = new UserDto();
		// Estrarre i valori dal resultset
		entity.setUserId(rs.getInt("USER_ID"));
		entity.setUserName(rs.getString("USER_NAME"));
		entity.setPassword(rs.getString("PASSWORD"));
		entity.setEnabled(rs.getBoolean("ENABLED"));
		return entity;
	}

}
