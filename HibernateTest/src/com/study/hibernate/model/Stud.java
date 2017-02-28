package com.study.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="StudentHibTest1", uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class Stud {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="NAME", length=20, nullable=true)
	private String name;
	
	@Column(name="AGE", length=20, nullable=true)
	private int age;
	
	@Column(name="YEAR", length=20, nullable=true)
	private int year;
	
	public Stud() {
		super();
	}
	
	public Stud(int id, String name, int age, int year) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.year = year;
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
