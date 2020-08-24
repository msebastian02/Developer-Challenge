package com.example.location.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")

public class Location {
	
	@Id
	@Column(name="idlocation")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlocation;
	@Column(name="name", nullable=false, length = 50)
	public String name;
	@Column(name="area", nullable=false)
	private int area;
	@Column(name="parent_location", nullable=true, length = 50)
	private String parent_location;
	
	public int getIdlocation() {
		return idlocation;
	}
	public void setIdlocation(int idlocation) {
		this.idlocation = idlocation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getParent_location() {
		return parent_location;
	}
	public void setParent_location(String parent_location) {
		this.parent_location = parent_location;
	}
	

}
