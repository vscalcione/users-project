package it.intersistemi.springframework.dto;

public class GroupDto {

	private String groupName;
	private String description;

	public GroupDto() {
	}

	public GroupDto(String groupName, String description) {
		this.groupName = groupName;
		this.description = description;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
