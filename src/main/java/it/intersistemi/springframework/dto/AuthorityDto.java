package it.intersistemi.springframework.dto;

public class AuthorityDto {

	private String authority;
	private String description;

	public AuthorityDto() {
	}

	public AuthorityDto(String authority, String description) {
		this.authority = authority;
		this.description = description;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
