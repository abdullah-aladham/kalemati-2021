package com.abdullah_aladham.Kalemati21.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Requests {//admin(cru_isdeleted) customer(c_isdeleted)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long id;
	private String name;
	private Date request_date;
	private String requestCode;
//	private School customer;

	public Requests(Long id, String name, Date request_date, String requestCode) {
		this.id = id;
		this.name = name;
		this.request_date = request_date;
		this.requestCode = requestCode;
	}
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRequest_date() {
		return request_date;
	}
	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}
//	public School getCustomer() {
//		return customer;
//	}
//	public void setCustomer(School customer) {
//		this.customer = customer;
//	}

}
