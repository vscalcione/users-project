package it.intersistemi.springframework.dto;

public class TodoDto {

	private int idActivity;
	private String description;
	private int activityOrder;

	public TodoDto() {
	}

	public TodoDto(int idActivity, String description, int activityOrder) {
		this.idActivity = idActivity;
		this.description = description;
		this.activityOrder = activityOrder;
	}

	public int getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(int idActivity) {
		this.idActivity = idActivity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getActivityOrder() {
		return activityOrder;
	}

	public void setActivityOrder(int activityOrder) {
		this.activityOrder = activityOrder;
	}
}
