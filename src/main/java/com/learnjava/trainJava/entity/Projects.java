package com.learnjava.trainJava.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.learnjava.trainJava.entity.enumeration.Capacity;
import com.learnjava.trainJava.entity.enumeration.EmploymentMode;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "application")
@NoArgsConstructor
public class Projects {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	@NotBlank(message = "Name project is required")
	private String name;
	
	@Column(name = "employment_mode")
	@NotBlank(message = "Employment mode is required")
	@Enumerated(EnumType.STRING)
	private EmploymentMode employmentMode;
	
	@Column(name = "capacity")
	@NotBlank(message = "Capacity is required")
	@Enumerated(EnumType.STRING)
	private Capacity capacity;
	
	@Column(name = "duration_in_month")
	@NotBlank(message = "Duration in month is required")
	private Integer durationInMonth;
	
	@Column(name = "startYear")
	@NotBlank(message = "Start year in month is required")
	private Integer startYear;
	
	@Column(name = "role")
	@NotBlank(message = "Role is required")
	private String role;
	
	@Column(name = "team_size")
	@NotBlank(message = "Team size is required")
	private Integer teamSize;
	
	@Column(name = "link_repo")
	@NotBlank(message = "Link reponsitory is required")
	private String linkRepo;
	
	@Column(name = "live_url")
	@NotBlank(message = "Link live url project is required")
	private String liveUrl;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_application_id", referencedColumnName = "id", nullable = false)
	private Application application;	
}
