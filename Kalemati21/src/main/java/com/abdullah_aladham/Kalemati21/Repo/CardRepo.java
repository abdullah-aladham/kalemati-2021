package com.abdullah_aladham.Kalemati21.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.Kalemati21.Model.cards;

@Repository
public interface CardRepo extends JpaRepository<cards,Long> {
	Optional<cards> findCardById(long id);

//		static void deleteCardById(Long id) {
//			// TODO Auto-generated method stub
//			
//		}
}
