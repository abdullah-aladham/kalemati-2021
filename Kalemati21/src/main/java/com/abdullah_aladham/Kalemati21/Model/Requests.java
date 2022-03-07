package com.abdullah_aladham.Kalemati21.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Requests {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long id;
	private String name;
	private Date request_date;
	private Customer customer;
@Column(name ="id")
private Long cust_id;
@Column
private String Status;
}
