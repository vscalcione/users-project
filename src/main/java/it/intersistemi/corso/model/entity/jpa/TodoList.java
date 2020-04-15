package it.intersistemi.corso.model.entity.jpa;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the TODO_LIST database table.
 * 
 */
@Entity
@Table(name="TODO_LIST")
@NamedQuery(name="TodoList.findAll", query="SELECT t FROM TodoList t")
public class TodoList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ATTIVITA", unique=true, nullable=false, length=50)
	private String idAttivita;

	@Column(length=255)
	private String descrizione;

	@Column(name="ORDINE_ATTIVITA", nullable=false)
	private int ordineAttivita;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USERNAME", nullable=false)
	private User_dacontrollare user;

	public TodoList() {
	}

	public String getIdAttivita() {
		return this.idAttivita;
	}

	public void setIdAttivita(String idAttivita) {
		this.idAttivita = idAttivita;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getOrdineAttivita() {
		return this.ordineAttivita;
	}

	public void setOrdineAttivita(int ordineAttivita) {
		this.ordineAttivita = ordineAttivita;
	}

	public User_dacontrollare getUser() {
		return this.user;
	}

	public void setUser(User_dacontrollare user) {
		this.user = user;
	}

}
