package com.serey.springboot.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.serey.springboot.learnspringframework.game.GameRunner;
import com.serey.springboot.learnspringframework.game.MarioGame;
import com.serey.springboot.learnspringframework.game.PacmanGame;
import com.serey.springboot.learnspringframework.game.SuperContraGame;

public class App01GamingBasiscJava {

	public static void main(String[] args) {
		//1.Launch a Spring Context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2. Configure the things that we want Spring to manage - @Configuration
		//HelloWord Configuration -@Configuration
		//name -@Bean
		
		//3.Retrieving Beans manage by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));

		System.out.println(context.getBean("address2"));

		System.out.println(context.getBean(Address.class));
		
		
		
	}

}
