package com.abdullah_aladham.Kalemati21.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Child {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
private Long id;
	@Column(nullable=false)
private String name;
	@Column(nullable=false)
private float age;
	@Column(nullable=false)
private String gender;
	@Column(nullable=false)
private String ChildCode;
	@ManyToMany
	Set<Customer> Parents;
public Child() {}
public Child(Long id,String name,float age,String gender, String code ) {
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.ChildCode=code;
}
public Long getId() {
	return id;
}
public void setId(Long newId) {
	this.id=newId;
}

public String getName() {
	return name;
}
public void setName(String newName) {
	this.name=newName;
}
public float getAge() {
	return age;
}
public void setAge(float newAge) {
	this.age=newAge;
}
public String getGender() {
	return gender;
}
public void setGender(String cgender) {
	this.gender=cgender;
}
public String getCode() {
	return ChildCode;
}
public void SetCode(String newCode) {
	this.ChildCode=newCode;
}

public String toString() {
	return "id: "+id+"Childname: "+name+"Age is: "+age+"gender: "+gender+"ChildCode is: "+ChildCode;
}
}
