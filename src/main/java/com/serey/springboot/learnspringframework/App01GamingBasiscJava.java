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
		
		System.out.println(context.getBean("name"));
		
		
	}

}
