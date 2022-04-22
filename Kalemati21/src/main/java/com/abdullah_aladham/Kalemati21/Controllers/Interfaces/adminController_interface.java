package com.abdullah_aladham.Kalemati21.Controllers.Interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.abdullah_aladham.Kalemati21.Model.Patients;
import com.abdullah_aladham.Kalemati21.Model.School;
import com.abdullah_aladham.Kalemati21.Model.Teacher;

public interface adminController_interface {
	public ResponseEntity<List<School>> getAllSchools();
	public ResponseEntity<List<School>> getAllSchoolsNames();
	public ResponseEntity<List<School>> getAllSchoolLocations();
	public ResponseEntity<List<School>> getAllSchoolsIDs();
	//end of all schools GET request

	
	public ResponseEntity<List<Teacher>> getAllTeachers();
	public ResponseEntity<List<Teacher>> getAllTeacherNames();
	public ResponseEntity<List<Teacher>> getAllTeacherLocations();
	public ResponseEntity<List<Teacher>> getAllTeachersIDs();
	//end of all Teachers GET REQUEST
	
	//children GET requests
	public ResponseEntity<List<Patients>> getAllchildren();
	public ResponseEntity<List<Patients>> getAllchildrenIDs();
	public ResponseEntity<List<Patients>> getAllchildrenLocations();
	public ResponseEntity<List<Patients>> getAllchildrenNames();
	public ResponseEntity<List<Patients>> getAllchildrenAges();
	public ResponseEntity<List<Patients>> getAllchildren_Disabilities();
	
	
	//Teacher POST
	public ResponseEntity<List<Teacher>> AddTeacher();
	public ResponseEntity<List<Teacher>> AddTeacherLocation();
	public ResponseEntity<List<Teacher>> AddTeacherID();

	//school GET Requests combined
	public ResponseEntity<List<School>> getSchoolsByNameandLocations();
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndChildID();
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndID();
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherID();
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherName();
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherID();
//	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherIDAndChildName();
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherIDAndChildNameAndChildID();
	public ResponseEntity<List<School>> getSchoolsByChildDisability();
	



	






	








	


	
}
