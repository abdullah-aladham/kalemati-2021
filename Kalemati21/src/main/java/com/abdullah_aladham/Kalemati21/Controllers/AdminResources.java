package com.abdullah_aladham.Kalemati21.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah_aladham.Kalemati21.Model.Child;
import com.abdullah_aladham.Kalemati21.Model.School;
import com.abdullah_aladham.Kalemati21.Model.Teacher;

@RestController
@RequestMapping("/admin")
public class AdminResources implements adminController_interface {

	@Override
	public ResponseEntity<List<School>> getAllSchools() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getAllSchoolsNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getAllSchoolLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getAllSchoolsIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Teacher>> getAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Teacher>> getAllTeacherNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Teacher>> getAllTeacherLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Teacher>> getAllTeachersIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Child>> getAllchildren() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Child>> getAllchildrenIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Child>> getAllchildrenLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Child>> getAllchildrenNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Child>> getAllchildrenAges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Child>> getAllchildren_Disabilities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Teacher>> AddTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Teacher>> AddTeacherLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Teacher>> AddTeacherID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndChildID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherIDAndChildName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherIDAndChildNameAndChildID() {
		// TODO Auto-generated method stub
		return null;
	}

}
