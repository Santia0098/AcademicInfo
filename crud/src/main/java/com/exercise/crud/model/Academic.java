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
	private String laste_name;
	private int phone;
	private String email;
	private String address;
	private Date birthdate;
	private String resumen;
	private Date createdDate;
	private Date updatedDate;
	
	
	
	public Academic() {
		
	}

	
	
	public Academic(int id_academic, String laste_name, int phone, String email, String address, Date birthdate,
			String resumen, Date createdDate, Date updatedDate) {
		super();
		this.id_academic = id_academic;
		this.laste_name = laste_name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.birthdate = birthdate;
		this.resumen = resumen;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	
	

	public int getId_academic() {
		return id_academic;
	}
	public void setId_academic(int id_academic) {
		this.id_academic = id_academic;
	}
	public String getLaste_name() {
		return laste_name;
	}
	public void setLaste_name(String laste_name) {
		this.laste_name = laste_name;
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
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
} 
