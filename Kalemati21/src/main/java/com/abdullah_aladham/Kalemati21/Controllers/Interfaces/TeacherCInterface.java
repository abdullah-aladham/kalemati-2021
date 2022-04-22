package com.abdullah_aladham.Kalemati21.Controllers.Interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.abdullah_aladham.Kalemati21.Model.Patients;

public interface TeacherCInterface {
	public ResponseEntity<List<Patients>> getAllChildren();//1
	public ResponseEntity<List<Patients>> getChildByname();//2
	public ResponseEntity<List<Patients>> getChildByID();//3
	public ResponseEntity<List<Patients>> getChildByLoc();//get child by location 4
	public ResponseEntity<List<Patients>> getChildBySchool();//5
	public ResponseEntity<List<Patients>> getChildByDisablity();//6
	public ResponseEntity<List<Patients>> getchildByNameAndID();//7
	public ResponseEntity<List<Patients>> getchildByNameAndIDAndLocation();//8
	public ResponseEntity<List<Patients>> getchildByNameAndIDAndLocationِAndSchoolName();//9
	public ResponseEntity<List<Patients>> getchildByNameAndIDAndLocationAndSchoolName();//10
	public ResponseEntity<List<Patients>> getchildByNameAndIDAndLocationAndSchoolNameAndID();//11








	




}
