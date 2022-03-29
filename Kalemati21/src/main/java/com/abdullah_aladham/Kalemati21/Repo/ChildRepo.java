package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.Kalemati21.Model.Child;

@Repository
public interface ChildRepo extends JpaRepository<Child,Long> {
Optional<Child> findChildById(Long id);
Optional<Child> findChildBySchoolId(Long id); 
Optional<Child> findChildByname(String name);
Optional<Child> findChildLocation(String location);
Optional<Child> findChildByIdAndName(String id,String name);
Optional<Child> findChildByIdAndNameAndLocation(Long id,String name,String loc);

	
//	static void deleteChildById(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
 Optional<Child> isdeleted(boolean del);
 
 



}
