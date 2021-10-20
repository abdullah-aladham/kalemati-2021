package com.abdullah_aladham.Kalemati21.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.Kalemati21.Exceptions.ChildNotFoundException;
import com.abdullah_aladham.Kalemati21.Model.Child;
import com.abdullah_aladham.Kalemati21.Repo.ChildRepo;


@Service
public class ChildService {
	private final ChildRepo childRepo;

	@Autowired
	public ChildService(ChildRepo customerRepo) {
		this.childRepo=customerRepo;
	}
	public Child addChild(Child child) {
	child.SetCode(UUID.randomUUID().toString());
	return childRepo.save(child);
	}

	public List<Child> findallChildren(){
		return childRepo.findAll();
	}

	public Child findChildById(Long id) {
	return  childRepo.findChildById(id).orElseThrow(()->new ChildNotFoundException("The user id"+id+" is not found"));	
	}
	public Child UpdateChild(Child child) {
		return childRepo.save(child);
	}

	public void DeleteChild(Long id) {
		ChildRepo.deleteChildById(id);
	}
	
}
