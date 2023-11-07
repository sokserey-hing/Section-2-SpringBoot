package com.serey.springboot.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address addresss) {}
record Address (String firstLine, String City) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Rango" ;
	}

	@Bean 
	public int age() {
		return 24; 
	}
	
	@Bean
	public Person person() {
		var person = new Person("Sam", 26, new Address("Pub Street", "Siem Reap"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		
		return new Person(name(),age(), address()); // name. age from person
	}
	
	@Bean
	
	public Person person3Parameters(String name, int age, Address address3) { // name, age, address2 
		return new Person(name, age, address3);
	}
	
	
	//if we make it primary then when we call the bean to get class we will it the primary on otherwise there will be ambiguity
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) { // name, age, address2 
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) { // name, age, address2 
		return new Person(name, age, address);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		var address = new Address("BKK", "Phnom Penh");
		return address;
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")  // this is the alternative of using @Primary
	public Address address3() {
		var address = new Address("Pub Street", "SiemReap");
		return address;
	}
}
