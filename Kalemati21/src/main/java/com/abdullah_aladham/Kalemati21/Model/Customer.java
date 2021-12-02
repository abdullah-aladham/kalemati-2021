package com.abdullah_aladham.Kalemati21.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long id;
	@Column(nullable=false)
	private String Firstname;
	@Column(nullable=false)
	private String last_name;
	@Column(nullable=false)
	private String Phonenumber;
	@Column(nullable=false ,updatable=false)
	private String Username;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String cpass;
	@Column(nullable=false)
	private String Email;
	@Column(nullable=false)
	private String CustomerCode;
	@ManyToMany
	Set<Child> children;
	@ManyToMany
	Set<cards> card;
	
	Customer(Long id,String Firstname,String lastname,String Phoneno,String uname,String pass, String mail,String Ccode){
		
		this.id=id;
		this.Firstname=Firstname;
		this.last_name=lastname;
		this.Phonenumber=Phoneno;
		this.Username=uname;
		this.password=pass;
		this.Email=mail;
		this.CustomerCode=Ccode;
	}
public Long getId() {
	return id;
	
}
public void setId(Long id) {
	this.id=id;
}
public String getName() {
	return Firstname.concat(last_name);
	
}
public void Setname(String Firstname,String Last_name) {
	this.Firstname=Firstname;
	this.last_name=Last_name;
}
public String get_phonenum() {
	return Phonenumber;
}
public void set_phonenumber(String phonenumber) {
	this.Phonenumber=phonenumber;
}
public String getusername() {
	return Username;
}
public void setUsername(String Username) {
	this.Username=Username;
}
public String getEmail() {
	return Email;
}
public void setEmail(String Email) {
	this.Email=Email;
}
public String getCode() {
	return CustomerCode;
}
public void setCode(String newCode) {
	this.CustomerCode=newCode;
}

public String getpass() {
	return password;
}
public void setpass(String newpass) {
	this.password=newpass;
}
public void setconfpass(String newpass) {
	this.cpass=newpass;
}
public String getconfpass() {
	return cpass;
}
public boolean ismatch(String pass,String cpass) {
	if(pass.equals(cpass) || cpass.equals(pass)) {
		return true;
	}
	else return false;
}
@Override
public String toString() {
	return "Customer {}"+"id="+id+", name="+Firstname.concat(last_name)+" , phone number"+Phonenumber +", Username"+Username+", Email"+Email+", Customer Code:"+CustomerCode;
}
}
