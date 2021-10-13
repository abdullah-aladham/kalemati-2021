package com.abdullah_aladham.Kalemati21.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.abdullah_aladham.Kalemati.Model.cards;

import service.CardsService;

public class CardResources {
	private final  CardsService cardService; 

	public CardResources(CardsService cardService) {
		this.cardService=cardService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<cards>> getAllCustomers(){
		List<cards> cards =cardService.findAllCards();
		return new ResponseEntity<>(cards, HttpStatus.OK);
	}


	@GetMapping("/find/{id}")
	public ResponseEntity<cards> getCardById(@PathVariable("id")Long id){
		cards card =cardService.findCardById(id);
		return new ResponseEntity<>(card, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<cards> addCard(@RequestBody cards card){
		cards Newcard =cardService.addCard(card);
		return new ResponseEntity<>(Newcard,HttpStatus.CREATED);
		
	}
	@PutMapping("/update")
	public ResponseEntity<cards> updatecard(@RequestBody cards card){
		cards updatecard =cardService. UpdateCard(card);
		return new ResponseEntity<>(updatecard,HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCard(@PathVariable("id")Long id){
		cardService. DeleteCard(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
