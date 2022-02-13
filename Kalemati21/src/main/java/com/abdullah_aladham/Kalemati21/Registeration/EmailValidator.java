package com.abdullah_aladham.Kalemati21.Registeration;

import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EmailValidator implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Regex to validate email
		return true;//for development process it will be true
	}

}
