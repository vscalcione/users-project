package it.intersistemi.corso.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name="EMPLOYEE")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_EMPLOYEE", unique=true, nullable=false)
	private Integer idEmployee;

	@Column(name="EMPLOYEE_SURNAME", length=100)
	private String employeeSurname;

	@Column(name="EMPLOYEE_NAME", nullable=false, length=100)
	private String employeeName;

	//bi-directional many-to-many association to Attivita
	@ManyToMany(mappedBy="employees")
	private Set<Activity> activities;

	public Employee() {
	}

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getEmployeeSurname() {
		return employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}
}
