package com.pr.demoPR.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {

	@Id
	@GeneratedValue
	@Column(name= "id")
	private int idCurso;
	
	@Column(name= "name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name= "price")
	private int Price;
	
	@Column(name= "hours")
	private int hours;
	
	public Curso() {
		
	}
	
	public Curso(int idCurso, String name, String description, int price, int hours) {
		super();
		this.idCurso = idCurso;
		this.name = name;
		this.description = description;
		Price = price;
		this.hours = hours;
	}
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
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
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", name=" + name + ", description=" + description + ", Price=" + Price
				+ ", hours=" + hours + "]";
	}
}
