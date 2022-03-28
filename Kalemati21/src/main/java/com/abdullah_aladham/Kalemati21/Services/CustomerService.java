package com.abdullah_aladham.Kalemati21.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.Kalemati21.Model.School;
import com.abdullah_aladham.Kalemati21.Repo.CustomerRepo;
import com.abdullah_aladham.Kalemati21.Exceptions.UserNotFoundException;
@Service
public class CustomerService {
	private final CustomerRepo customerRepo;

	@Autowired
	public CustomerService(CustomerRepo customerRepo) {
		this.customerRepo=customerRepo;
	}
	public School addCustomer(School customer) {
	customer.setCode(UUID.randomUUID().toString());
	return customerRepo.save(customer);
	}

	public List<School> findallCustomers(){
		return customerRepo.findAll();
	}

	public School findCustomerById(Long id) {
	return  customerRepo.findCustomerById(id).orElseThrow(()->new UserNotFoundException("The user id"+id+" is not found"));	
	}
	public School UpdateCustomer(School customer) {
		return customerRepo.save(customer);
	}

	public void DeleteCustomer(Long id) {
		customerRepo.deleteCustomerById(id);
	}
	public void changepass(School c) {
		//if(ismatch(c.setpass(pass),c.setconf(cpass)==true) {
			//customerRepo.save(c);
		}
}
