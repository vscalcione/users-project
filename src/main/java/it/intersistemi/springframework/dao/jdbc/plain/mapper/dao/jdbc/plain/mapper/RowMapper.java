package it.intersistemi.springframework.dao.jdbc.plain.mapper.dao.jdbc.plain.mapper;

import java.sql.ResultSet;
import java.util.*;
import java.util.function.Supplier;

public interface RowMapper<T> {

	T mapRow(ResultSet rs, int rowNum) throws java.sql.SQLException;

	default List<T> mapRowsAsList(ResultSet rs) throws java.sql.SQLException {
		return this.mapRows(rs, () -> new ArrayList<T>());
	}

	default Set<T> mapRowsAsSet(ResultSet rs) throws java.sql.SQLException {
		return this.mapRows(rs, () -> new HashSet<T>());
	}

	default <C extends Collection<T>>  C mapRows(ResultSet rs,
                                                 Supplier<C> collectionCreator) throws java.sql.SQLException {
		C entities = collectionCreator.get();
		while(rs.next()) {
			T entity = this.mapRow(rs, rs.getRow());
			entities.add(entity);
		}
		return entities;
	}

}
