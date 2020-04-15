package it.intersistemi.springframework.repository;

import it.intersistemi.springframework.dao.jpa.TodoList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoListRepository extends CrudRepository<TodoList, String> {

	List<TodoList> findByUserUsernameOrderByOrdineAttivita(String username);
}
