package learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.serey.springboot.learnspringframework.game.GameRunner;
import com.serey.springboot.learnspringframework.game.GamingConsole;



@Configuration
@ComponentScan("com.serey.springboot.learnspringframework.game")
public class App03GamingSpringBeans {	

	
	public static void main(String[] args) {

		
		var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);
		try(context){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}

	}

}

