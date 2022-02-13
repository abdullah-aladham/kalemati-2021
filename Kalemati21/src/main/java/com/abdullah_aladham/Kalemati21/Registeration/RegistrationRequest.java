package com.abdullah_aladham.Kalemati21.Registeration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class RegistrationRequest {
	private String Firstname;
	private String last_name;
	private String Phonenumber;
	private String Username;
	private String password;
	private String cpass;
	private String Email;

}
