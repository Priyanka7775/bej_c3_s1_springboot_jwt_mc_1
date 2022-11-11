package com.example.authenticatedemo;

import com.example.authenticatedemo.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthenticatedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticatedemoApplication.class, args);
	}


	@Bean
	public FilterRegistrationBean jwtFilter(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new JwtFilter());
		filterRegistrationBean.addUrlPatterns("/userdata/v1/fetchusers");
		filterRegistrationBean.addUrlPatterns("/userdata/v1/{userid}");
		return filterRegistrationBean;
	}


}
