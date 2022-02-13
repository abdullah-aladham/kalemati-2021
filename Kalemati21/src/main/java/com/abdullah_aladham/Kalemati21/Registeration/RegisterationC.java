package com.abdullah_aladham.Kalemati21.Registeration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.AllArgsConstructor;
@RestController
@RequestMapping(path="api/v1/registr")
@AllArgsConstructor
public class RegisterationC {
	private RegistrationService registrationService;

	public String register(@RequestBody RegistrationRequest request) {
		return registrationService.register(request);
	}
}
