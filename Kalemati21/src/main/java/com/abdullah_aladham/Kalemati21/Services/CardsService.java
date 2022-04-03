package com.abdullah_aladham.Kalemati21.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.Kalemati21.Model.cards;
import com.abdullah_aladham.Kalemati21.Repo.CardRepo;
//import com.abdullah_aladham.Kalemati21.Repo.CardRepo;
import com.abdullah_aladham.Kalemati21.Exceptions.*;


@Service
public class CardsService {
	
	private final CardRepo cardRepo;
	
	
	@Autowired
	public CardsService(CardRepo cardRepo) {
		this.cardRepo=cardRepo;
	}
	public CardsService() {
		this.cardRepo = null;}
public cards addCard(cards card) {
	card.SetCode(UUID.randomUUID().toString());
	return cardRepo.save(card);
}
public List<cards> findAllCards(){
	return cardRepo.findAll();
}
public cards findCardById(long id) {
	return cardRepo.findCardById(id).orElseThrow(()->new CardNotFoundException("the card  that you looking for is not found"));
}
public cards UpdateCard(cards card) {
return	cardRepo.save(card);
}
//public void DeleteCard(Long id) {
//	CardRepo.deleteCardById(id);
//}
 
}
