package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.Kalemati21.Model.Patients;

@Repository
public interface PatientsRepo extends JpaRepository<Patients,Long> {
Optional<Patients> findChildById(Long id);
Optional<Patients> findChildBySchoolId(Long id); 
Optional<Patients> findChildByname(String name);
Optional<Patients> findChildLocation(String location);
Optional<Patients> findChildByIdAndName(String id,String name);
Optional<Patients> findChildByIdAndNameAndLocation(Long id,String name,String loc);

	
//	static void deleteChildById(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
 Optional<Patients> isdeleted(boolean del);
 
 



}
