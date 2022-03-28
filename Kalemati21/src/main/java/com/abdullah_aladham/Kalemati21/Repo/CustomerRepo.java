package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.abdullah_aladham.Kalemati21.Model.Customer;
import com.abdullah_aladham.Kalemati21.Model.School;


@Repository
public interface CustomerRepo extends JpaRepository<School,Long> {
	void deleteCustomerById(Long id);

	Optional<School>  findCustomerById(Long id);
}
