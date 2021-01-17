package com.maoptech.Roshani.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_persons")
public class  {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private int id;
	private String name;
	private String email;
	@Column(name = "category_id")
	private int categoryId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public Persons(String name, String email, int categoryId) {
		super();
		this.name = name;
		this.email = email;
		this.categoryId = categoryId;
	}
	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
