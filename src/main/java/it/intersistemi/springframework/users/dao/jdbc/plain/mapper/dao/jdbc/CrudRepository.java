package it.intersistemi.springframework.users.dao.jdbc.plain.mapper.dao.jdbc;

public interface CrudRepository<T, PK> {

	Iterable<T> findAll();

	T findById(PK id);

	PK insert(T entity);

	int update(PK id, T entity);

	int deleteById(PK id);

}
