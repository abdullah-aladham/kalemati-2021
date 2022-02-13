package com.abdullah_aladham.Kalemati21.Registeration;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrationService {

	private EmailValidator emailValidator;
	public String register(RegistrationRequest request) {
		// TODO Auto-generated method stub
		boolean IsValidEmail=emailValidator.
				test(request.getEmail());//variable for storing boolean result of email validation
		if(!IsValidEmail) {
			throw new IllegalStateException("email not valid");
		}
		
		return "works";
	}

}
