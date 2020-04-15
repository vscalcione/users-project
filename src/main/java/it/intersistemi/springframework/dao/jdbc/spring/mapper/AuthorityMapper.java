package it.intersistemi.springframework.dao.jdbc.spring.mapper;

import it.intersistemi.springframework.users.model.AuthorityDto;
import org.springframework.jdbc.core.RowMapper;

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
