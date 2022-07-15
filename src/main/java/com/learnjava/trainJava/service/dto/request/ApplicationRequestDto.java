package com.learnjava.trainJava.service.dto.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApplicationRequestDto {

	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message = "Name is required")
	private String name;

	@NotBlank(message = "Name is required")
	private String gitUser;

	@NotEmpty(message = "Git user is required")
	private List<ProjectRequestDto> projects;
}
