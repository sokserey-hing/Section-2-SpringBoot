package com.serey.springboot.learnspringframework.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

	// @Autowired // this is called field injection
	Dependency1 dependency1;

	// @Autowired
	Dependency2 dependency2;

	
	
//	@Autowired // this is called constructor injection 
	// for constructor injection @Autowired is not mandatory
	//Spring team recommended constructor base injection 
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injction - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

//	@Autowired // this is called setter injection
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - setDependency1 ");
//		this.dependency1 = dependency1;
//	}
//	@Autowired  // this is called setter injection
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - setDependency2 ");
//		this.dependency2 = dependency2;
//	}

	public String toString() {

		return "Using " + dependency1 + " and " + dependency2;

	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
		try (context) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));

		}

	}

}
