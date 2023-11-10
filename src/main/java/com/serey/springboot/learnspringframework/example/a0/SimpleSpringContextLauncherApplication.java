package com.serey.springboot.learnspringframework.example.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;






@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {	
	
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);
		try(context){
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

		}

	}

}

