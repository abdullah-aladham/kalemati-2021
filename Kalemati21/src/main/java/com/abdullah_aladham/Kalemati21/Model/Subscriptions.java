package com.abdullah_aladham.Kalemati21.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Subscriptions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)

private Long id;
	@Column(nullable=false)

private String name;
	@Column(nullable=false)
	
private Date  sub_start;
	@Column(nullable=false)

private Date sub_end;
	@Column(nullable=false)

private String subtoken;
//boolean didend;
	@Column(nullable=false)

private Long UserId;
private String Code;

Subscriptions(Long id ,String name,Date start,Date end,String token,Long uid){
	this.id=id;
	this.name=name;
	this.sub_start=start;
	this.sub_end=end;
	this.subtoken=token;
	this.UserId=uid;
}
public Long getid() {
	return id;

}
public void setId(Long newId) {
	this.id=newId;
}
public String getName() {
	return name;
}
public void Setname(String newname) {
	this.name=newname;
}
public Date getStartDate() {
	return sub_start;
}
public void setStartDate(Date newdate) {
	this.sub_start=newdate;
}
public Date GetendDate() {
	return sub_end;
}
public void setEnd(Date newEnd) {
	this.sub_end=newEnd;
}
public String getCode() {
	return Code;
}
public void SetCode(String NewCode) {
	this.Code=NewCode;
}
}
