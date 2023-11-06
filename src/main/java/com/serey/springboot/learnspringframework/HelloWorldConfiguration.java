package com.serey.springboot.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {}
record Address (String firstLine, String City) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Rnago" ;
	}

	@Bean 
	public int age() {
		return 24; 
	}
	
	@Bean
	public Person person() {
		var person = new Person("Sam", 26);
		return person;
	}
	
	@Bean 
	public Address address() {
		var address = new Address("BKK", "Phnom Penh");
		return address;
	}
}
