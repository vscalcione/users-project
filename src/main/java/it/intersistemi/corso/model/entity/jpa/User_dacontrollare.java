package it.intersistemi.corso.model.entity.jpa;

import it.intersistemi.corso.model.entity.jpa.TodoList;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
@Table(name="USER")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User_dacontrollare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=50)
	private String username;

	@Column(nullable=false, length=50)
	private String password;

	//bi-directional many-to-one association to TodoList
	@OneToMany(mappedBy="user")
	private Set<TodoList> todoLists;

	public User_dacontrollare() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<TodoList> getTodoLists() {
		return this.todoLists;
	}

	public void setTodoLists(Set<TodoList> todoLists) {
		this.todoLists = todoLists;
	}

	public TodoList addTodoList(TodoList todoList) {
		getTodoLists().add(todoList);
		todoList.setUser(this);

		return todoList;
	}

	public TodoList removeTodoList(TodoList todoList) {
		getTodoLists().remove(todoList);
		todoList.setUser(null);

		return todoList;
	}

}
