package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.Kalemati21.Model.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
	void deleteCustomerById(Long id);

	Optional<Customer>  findCustomerById(Long id);
}
