package com.abdullah_aladham.Kalemati21.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah_aladham.Kalemati21.Model.Child;
import com.abdullah_aladham.Kalemati21.Services.*;
@RestController
@RequestMapping("/child")
public class ChildResources {
	
	private final  ChildService childService; 
	@Autowired
	public ChildResources() {
		this.childService = null;}

	public ChildResources(ChildService childService) {
	this.childService=childService;
}
	
@GetMapping("/all")
public ResponseEntity<List<Child>> getAllChildren(){
	List<Child> children =childService.findallChildren();
	return new ResponseEntity<>(children, HttpStatus.OK);
}


@GetMapping("/find/{id}")
public ResponseEntity<Child> getChildById(@PathVariable("id")Long id){
	Child child =childService. findChildById(id);
	return new ResponseEntity<>(child, HttpStatus.OK);
}

@PostMapping("/add")
public ResponseEntity<Child> addChild(@RequestBody Child child){
	Child Newchild =childService.addChild(child);
	return new ResponseEntity<>(Newchild,HttpStatus.CREATED);
	
}
@PutMapping("/update")
public ResponseEntity<Child> updateChild(@RequestBody Child child){
	Child updateChild =childService.UpdateChild(child);
	return new ResponseEntity<>(updateChild,HttpStatus.OK);
	
}
//@DeleteMapping("/delete/{id}")
//public ResponseEntity<?> deleteChild(@PathVariable("id")Long id){
//	childService. DeleteChild(id);
//	return new ResponseEntity<>(HttpStatus.OK);
//	
//}
}
