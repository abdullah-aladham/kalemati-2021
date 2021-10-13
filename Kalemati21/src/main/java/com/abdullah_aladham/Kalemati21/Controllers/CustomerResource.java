package com.abdullah_aladham.Kalemati21.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abdullah_aladham.Kalemati.Model.Customer;

import service.CustomerService;

public class CustomerResource {
	private final  CustomerService customerService; 

	public CustomerResource(CustomerService customerService) {
	this.customerService=customerService;
}
	public CustomerResource() {
		this.customerService = null;}

@GetMapping("/all")
public ResponseEntity<List<Customer>> getAllCustomers(){
	List<Customer> customers =customerService.findallCustomers();
	return new ResponseEntity<>(customers, HttpStatus.OK);
}


@GetMapping("/find/{id}")
public ResponseEntity<Customer> getCustomerById(@PathVariable("id")Long id){
	Customer customer =customerService. findCustomerById(id);
	return new ResponseEntity<>(customer, HttpStatus.OK);
}

@PostMapping("/add")
public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
	Customer Newcustomer =customerService.addCustomer(customer);
	return new ResponseEntity<>(Newcustomer,HttpStatus.CREATED);
	
}
@PutMapping("/update")
public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
	Customer updateCustomer =customerService.UpdateCustomer(customer);
	return new ResponseEntity<>(updateCustomer,HttpStatus.OK);
	
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteCustomer(@PathVariable("id")Long id){
	customerService. DeleteCustomer(id);
	return new ResponseEntity<>(HttpStatus.OK);
	
}
}
