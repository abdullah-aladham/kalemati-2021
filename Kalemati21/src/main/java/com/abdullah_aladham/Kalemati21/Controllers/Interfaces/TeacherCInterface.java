package com.abdullah_aladham.Kalemati21.Controllers.Interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.abdullah_aladham.Kalemati21.Model.Child;

public interface TeacherCInterface {
	public ResponseEntity<List<Child>> getAllChildren();//1
	public ResponseEntity<List<Child>> getChildByname();//2
	public ResponseEntity<List<Child>> getChildByID();//3
	public ResponseEntity<List<Child>> getChildByLoc();//get child by location 4
	public ResponseEntity<List<Child>> getChildBySchool();//5
	public ResponseEntity<List<Child>> getChildByDisablity();//6
	public ResponseEntity<List<Child>> getchildByNameAndID();//7
	public ResponseEntity<List<Child>> getchildByNameAndIDAndLocation();//8
	public ResponseEntity<List<Child>> getchildByNameAndIDAndLocationِAndSchoolName();//9
	public ResponseEntity<List<Child>> getchildByNameAndIDAndLocationAndSchoolName();//10
	public ResponseEntity<List<Child>> getchildByNameAndIDAndLocationAndSchoolNameAndID();//11








	




}
