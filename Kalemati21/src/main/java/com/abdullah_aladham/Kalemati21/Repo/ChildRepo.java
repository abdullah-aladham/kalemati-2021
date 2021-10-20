package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.Kalemati21.Model.Child;

@Repository
public interface ChildRepo extends JpaRepository<Child,Long> {
Optional<Child> findChildById(Long id);
	
	
	static void deleteChildById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
