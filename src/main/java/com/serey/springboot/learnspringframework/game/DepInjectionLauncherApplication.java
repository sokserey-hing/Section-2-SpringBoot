package com.serey.springboot.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.serey.springboot.learnspringframework.game")
public class DepInjectionLauncherApplication {	

	
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
		try(context){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}

	}

}

