package com.microservice.email.entities.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDTO {

	@NotBlank
	private Long emailID;
	@NotBlank
	private String ownerRef;
	@NotBlank
	@Email
	private String emailFrom;
	@Email
	@NotBlank
	private String emailTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String text;
}
