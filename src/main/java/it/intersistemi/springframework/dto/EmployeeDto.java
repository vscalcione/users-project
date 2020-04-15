package it.intersistemi.springframework.dto;

public class EmployeeDto {

	private Integer idEmployee;
	private String employeeSurname;
	private String employeeName;

	public EmployeeDto() {
	}

	public EmployeeDto(Integer idEmployee, String employeeSurname, String employeeName) {
		this.idEmployee = idEmployee;
		this.employeeSurname = employeeSurname;
		this.employeeName = employeeName;
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
}
