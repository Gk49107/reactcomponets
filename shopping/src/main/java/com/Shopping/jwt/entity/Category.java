package com.Shopping.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Category {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryid;

	private String name;

	
	public Category(){
		
	}


	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category(Integer categoryid, String name) {
		this.categoryid = categoryid;
		this.name = name;
	}
}
