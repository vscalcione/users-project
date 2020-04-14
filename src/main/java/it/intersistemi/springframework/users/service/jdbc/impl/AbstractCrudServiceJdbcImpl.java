package it.intersistemi.springframework.users.service.jdbc.impl;

import it.intersistemi.springframework.users.dao.jdbc.CrudRepository;
import it.intersistemi.springframework.users.service.CrudService;
import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractCrudServiceJdbcImpl<DTO, PK, R extends CrudRepository<DTO, PK>> implements CrudService<DTO, PK> {

	protected final R repository;

	public AbstractCrudServiceJdbcImpl(R repository) {
		super();
		this.repository = repository;
	}

	@Transactional
	public Iterable<DTO> findAll() {
		return repository.findAll();
	}

	@Transactional
	public long countAll() {
		return 0;
	}

	@Transactional
	public DTO findById(PK id) {
		return repository.findById(id);
	}

	@Transactional
	public PK insert(DTO dto) {
		return repository.insert(dto);
	}

	@Transactional
	public int update(PK id, DTO dto) {
		return repository.update(id, dto);
	}

	@Transactional
	public int deleteById(PK id) {
		return repository.deleteById(id);
	}

}
