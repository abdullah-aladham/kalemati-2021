package com.abdullah_aladham.Kalemati21;

import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication


@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class Kalemati21Application {

	public static void main(String[] args) {
		SpringApplication.run(Kalemati21Application.class, args);
		System.out.println(1);
	}
//	@Bean
//	public CorsFilter corsFilter() {
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
//				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
//				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
//		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
//				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
//		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//		return new CorsFilter(urlBasedCorsConfigurationSource);
//	}
//	 @Bean(name = "dataSource")
//	    public DataSource datasource() {
//	        return DataSourceBuilder.create()
//	                .driverClassName("com.mysql.cj.jdbc.Driver")
//	                .url("jdbc:mysql://localhost:3306/kalemati")
//	                .username("root")
//	                .password("HelloWorld-1516!")
//	                .build();
//	    }
	
}
