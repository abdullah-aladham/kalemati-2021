package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.abdullah_aladham.Kalemati21.Model.Child;

@Repository
public interface AdminRepo {
	Optional<Child> findChildById(Long id);

	
}
