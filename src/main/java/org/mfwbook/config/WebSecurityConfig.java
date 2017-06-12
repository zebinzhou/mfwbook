package org.mfwbook.config;

import org.mfwbook.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	SecurityService securityService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(securityService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
//            .antMatchers("/", "/home").permitAll()
            .anyRequest().authenticated()
        .and()
        .formLogin()
            .loginPage("/login")
            .failureUrl("/login?errror")
            .permitAll()
        .and()
        .logout()
            .permitAll();
	}
	
	

}
