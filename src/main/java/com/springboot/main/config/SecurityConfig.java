package com.springboot.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Authentication(Map each username/password to respective role)
		auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance()).withUser("user").password("password")
		.roles("USER").and().withUser("admin").password("password").roles("USER","ADMIN");
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//Autorization (Map each role to respective restendpoints/resources/access)
		http.httpBasic().and().authorizeRequests().antMatchers("/api/v1/welcome/**").hasRole("USER").antMatchers("/api/v1/**").hasRole("ADMIN").and().csrf().disable().headers().frameOptions().disable();
	}

} 