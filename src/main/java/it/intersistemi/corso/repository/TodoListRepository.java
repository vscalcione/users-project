package it.intersistemi.corso.repository;

import it.intersistemi.corso.model.entity.jpa.TodoList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoListRepository extends CrudRepository<TodoList, String> {

	List<TodoList> findByUserUsernameOrderByOrdineAttivita(String username);
}
