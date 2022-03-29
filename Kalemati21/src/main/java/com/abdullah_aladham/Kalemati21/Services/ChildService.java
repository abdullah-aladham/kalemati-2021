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
	public Child findChildWithname(String name) {
		return childRepo.findChildByname(name).orElseThrow(()->new ChildNotFoundException("The child with"+name+" is not found"));
	}
	public Child findChildByLocation(String location) {
		return childRepo.findChildLocation(location).orElseThrow(()->new ChildNotFoundException("The child with"+location+" is not found"));
	}
	public Child findChildWithIdandName(String id,String name) {
		return childRepo.findChildByIdAndName(id, name).orElseThrow(()->new ChildNotFoundException("The child with"+id+" and "+name+" is not found"));
	}
	public Child findChildWithIdNameAndLocation(String name,Long id ,String loc) {
		return childRepo.findChildByIdAndNameAndLocation(id,name, loc).orElseThrow(()->new ChildNotFoundException("The child with"+id+", "+name+" and "+loc+" is not found"));
	}
	public Child UpdateChild(Child child) {
		return childRepo.save(child);
	}

//	public void DeleteChild(Long id) {
//		ChildRepo.deleteChildById(id);
//	}
public Child isdeleted(boolean deleted) {
	return childRepo.isdeleted(deleted).orElseThrow(()->new ChildNotFoundException("The child is not deleted"));
}

}
