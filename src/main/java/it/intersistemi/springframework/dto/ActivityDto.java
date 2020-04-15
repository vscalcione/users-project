package it.intersistemi.springframework.dto;

import java.util.Date;

public class ActivityDto {

	private String idActivity;
	private Date endDate;
	private Date startDate;
	private String activityName;

	public ActivityDto() {
	}

	public ActivityDto(String idActivity, Date endDate, Date startDate, String activityName) {
		this.idActivity = idActivity;
		this.endDate = endDate;
		this.startDate = startDate;
		this.activityName = activityName;
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
}
