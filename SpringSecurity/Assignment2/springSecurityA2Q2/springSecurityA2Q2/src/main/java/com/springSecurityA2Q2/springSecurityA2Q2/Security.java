package com.springSecurityA2Q2.springSecurityA2Q2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Security {
	
	@Bean
	public PasswordEncoder passwordEncoder () {
		return new BCryptPasswordEncoder(10);
	}

}
