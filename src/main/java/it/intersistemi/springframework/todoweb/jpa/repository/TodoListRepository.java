package it.intersistemi.springframework.todoweb.jpa.repository;

import it.intersistemi.springframework.todoweb.jpa.entity.TodoList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoListRepository extends CrudRepository<TodoList, String> {

	List<TodoList> findByUserUsernameOrderByOrdineAttivita(String username);
}
