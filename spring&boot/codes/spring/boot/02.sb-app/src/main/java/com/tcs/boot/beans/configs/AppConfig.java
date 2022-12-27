package com.tcs.boot.beans.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcs.boot.utils.PasswordEncoder;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	//@Bean
	//@Bean(name = "encoder")
	@Bean(name = {"encoder","security"})
	public PasswordEncoder getPwdEncoder() {
		return new PasswordEncoder();
	}
}
