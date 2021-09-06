package com.exercise.crud.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_course;
	private String name;
	private String description;
	private String language;
	private Date estimatedDate;
	
	public Courses() {
		
	}
	
	

	public Courses(int id_course, String name, String description, String language, Date estimatedDate) {
		super();
		this.id_course = id_course;
		this.name = name;
		this.description = description;
		this.language = language;
		this.estimatedDate = estimatedDate;
	}



	public int getId_course() {
		return id_course;
	}

	public void setId_course(int id_course) {
		this.id_course = id_course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getEstimatedDate() {
		return estimatedDate;
	}

	public void setEstimatedDate(Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}
	
	
}
