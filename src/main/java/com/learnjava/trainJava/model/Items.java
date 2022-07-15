package com.learnjava.trainJava.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
	@Id
	private Integer pid;
	private String name_project;
	private String employment_mode;
	private String capacity;
	private Integer duration;
	private String start_year;
	private String role;
	private Integer team_size;
	private String link_repo;
	private String link_url;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName_project() {
		return name_project;
	}
	public void setName_project(String name_project) {
		this.name_project = name_project;
	}
	public String getEmployment_mode() {
		return employment_mode;
	}
	public void setEmployment_mode(String employment_mode) {
		this.employment_mode = employment_mode;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getStart_year() {
		return start_year;
	}
	public void setStart_year(String start_year) {
		this.start_year = start_year;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getTeam_size() {
		return team_size;
	}
	public void setTeam_size(Integer team_size) {
		this.team_size = team_size;
	}
	public String getLink_repo() {
		return link_repo;
	}
	public void setLink_repo(String link_repo) {
		this.link_repo = link_repo;
	}
	public String getLink_url() {
		return link_url;
	}
	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}
}
