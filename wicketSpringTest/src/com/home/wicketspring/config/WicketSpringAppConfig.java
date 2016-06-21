package com.home.wicketspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.home.wicketspring.services.AgeCheck;
import com.home.wicketspring.services.AgeCheckService;

@Configuration
@ComponentScan
public class WicketSpringAppConfig {
	@Bean
	AgeCheck ageCheck() {
		return new AgeCheckService();
	}
}