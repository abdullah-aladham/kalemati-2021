package com.abdullah_aladham.Kalemati21.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.Kalemati21.Repo.AdminRepo;
@Service
public class AdminServices {

	private final AdminRepo adminRepo;

	@Autowired
	public AdminServices(AdminRepo adminRepo) {
		super();
		this.adminRepo = adminRepo;
	}
	
	
	
	
}
