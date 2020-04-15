package it.intersistemi.springframework.dao.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the DIPENDENTE database table.
 *
 */
@Entity
@Table(name="DIPENDENTE")
@NamedQuery(name="Dipendente.findAll", query="SELECT d FROM Dipendente d")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_MATRICOLA", unique=true, nullable=false)
	private Integer idMatricola;

	@Column(length=100)
	private String cognome;

	@Column(nullable=false, length=100)
	private String nome;

	//bi-directional many-to-many association to Attivita
	@ManyToMany(mappedBy="dipendentes")
	private Set<Activity> attivitas;

	public Employee() {
	}

	public Integer getIdMatricola() {
		return this.idMatricola;
	}

	public void setIdMatricola(Integer idMatricola) {
		this.idMatricola = idMatricola;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Activity> getAttivitas() {
		return this.attivitas;
	}

	public void setAttivitas(Set<Activity> attivitas) {
		this.attivitas = attivitas;
	}

}
