package it.intersistemi.spring.entity;

import it.intersistemi.corso.entity.Employee;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name="ACTIVITY")
@NamedQuery(name="Activity.findAll", query="SELECT a FROM Activity a")
public class Activity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ACTIVITY", unique=true, nullable=false, length=36)
	private String idActivity;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE", nullable=false)
	private Date startDate;

	@Column(name="ACTIVITY_NAME", nullable=false, length=100)
	private String activityName;


	//bi-directional many-to-many association to Dipendente
	@ManyToMany
	@JoinTable(
		name="EMPLOYEE_ACTIVITY"
		, joinColumns={
			@JoinColumn(name="ID_ACTIVITY", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_EMPLOYEE", nullable=false)
			}
		)
	private Set<Employee> employees;

	public Activity() {
	}

	public String getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(String idActivity) {
		this.idActivity = idActivity;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
}
