package com.exercise.crud.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "academicInfo")
public class Academic {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_academic;
	private String last_name;
	private int phone;
	private String email;
	private String address;
	private Date birthdate;
	private String resumen;
	private Date created_date;
	private Date updated_date;
	
	
	
	public Academic() {
		
	}

	
	
	public Academic(int id_academic, String last_name, int phone, String email, String address, Date birthdate,
			String resumen, Date created_date, Date updated_date) {
		super();
		this.id_academic = id_academic;
		this.last_name = last_name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.birthdate = birthdate;
		this.resumen = resumen;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}
	
	

	public int getId_academic() {
		return id_academic;
	}
	public void setId_academic(int id_academic) {
		this.id_academic = id_academic;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String laste_name) {
		this.last_name = laste_name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public Date getCreatedDate() {
		return created_date;
	}
	public void setCreatedDate(Date createdDate) {
		this.created_date = createdDate;
	}
	public Date getUpdatedDate() {
		return updated_date;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updated_date = updatedDate;
	}
	
	
	
} 
