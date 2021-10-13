package com.abdullah_aladham.Kalemati21.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.abdullah_aladham.Kalemati21.Model.Customer;
import com.abdullah_aladham.Kalemati21.Repo.CustomerRepo;
import com.abdullah_aladham.Kalemati21.Exceptions.UserNotFoundException;

public class CustomerService {
	private final CustomerRepo customerRepo;

	@Autowired
	public CustomerService(CustomerRepo customerRepo) {
		this.customerRepo=customerRepo;
	}
	public Customer addCustomer(Customer customer) {
	customer.setCode(UUID.randomUUID().toString());
	return customerRepo.save(customer);
	}

	public List<Customer> findallCustomers(){
		return customerRepo.findAll();
	}

	public Customer findCustomerById(Long id) {
	return  customerRepo.findCustomerById(id).orElseThrow(()->new UserNotFoundException("The user id"+id+" is not found"));	
	}
	public Customer UpdateCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	public void DeleteCustomer(Long id) {
		customerRepo.deleteCustomerById(id);
	}
	public void changepass(Customer c) {
		//if(ismatch(c.setpass(pass),c.setconf(cpass)==true) {
			//customerRepo.save(c);
		}
}
