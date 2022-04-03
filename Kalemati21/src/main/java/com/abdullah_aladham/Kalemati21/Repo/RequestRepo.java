package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.Kalemati21.Model.Requests;

@Repository
public interface RequestRepo extends JpaRepository<Requests,Long> {

	Optional<Requests> FindReqById(Long id);
	Optional<Requests> FindReqByName(String name);
//	Optional<Requests> FindReqBy(Long id);

}
