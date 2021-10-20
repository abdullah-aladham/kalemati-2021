package com.abdullah_aladham.Kalemati21.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.authorizeRequests()
			.antMatchers("/","index","/css/*","/js/*")
			.permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic();
	}

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
	User.builder()
	.username("Sami")
	.password("password")
	.roles("STUDENT");
	.
	}

	
}
