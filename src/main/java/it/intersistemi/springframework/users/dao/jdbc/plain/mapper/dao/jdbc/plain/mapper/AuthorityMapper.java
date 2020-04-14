package it.intersistemi.springframework.users.dao.jdbc.plain.mapper.dao.jdbc.plain.mapper;

import it.intersistemi.springframework.users.dao.jdbc.plain.mapper.model.AuthorityDto;

import java.sql.ResultSet;

public class AuthorityMapper implements RowMapper<AuthorityDto> {

	public AuthorityDto mapRow(ResultSet rs, int rowNum) throws java.sql.SQLException {
		AuthorityDto entity = new AuthorityDto();
		// Estrarre i valori dal resultset
		entity.setAuthority(rs.getString("AUTHORITY"));
		entity.setDescription(rs.getString("DESCRIPTION"));
		return entity;
	}

}
