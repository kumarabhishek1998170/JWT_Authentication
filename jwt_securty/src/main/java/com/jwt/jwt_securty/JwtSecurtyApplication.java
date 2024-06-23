package com.jwt.jwt_securty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class JwtSecurtyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurtyApplication.class, args);
	}

}
