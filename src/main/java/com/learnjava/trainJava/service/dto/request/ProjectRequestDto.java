package com.learnjava.trainJava.service.dto.request;

import com.learnjava.trainJava.entity.enumeration.Capacity;
import com.learnjava.trainJava.entity.enumeration.EmploymentMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProjectRequestDto {
	private String name;
	private EmploymentMode employmentMode;
	private Capacity capacity;
	private Integer durationInMonth;
	private Integer startYear;
	private String role;
	private Integer teamSize;
	private String linkRepo;
	private String liveUrl;
}
