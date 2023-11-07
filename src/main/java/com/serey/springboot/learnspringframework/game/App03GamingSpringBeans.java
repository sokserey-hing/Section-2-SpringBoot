package com.serey.springboot.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		try(context){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}

	}

}

