package com.serey.springboot.learnspringframework;

import com.serey.springboot.learnspringframework.game.GameRunner;
import com.serey.springboot.learnspringframework.game.MarioGame;
import com.serey.springboot.learnspringframework.game.PacmanGame;
import com.serey.springboot.learnspringframework.game.SuperContraGame;

public class AppGamingBasiscJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); //1. Object creation 
		
		var gameRunner = new GameRunner(game); //2. Object creation + wiring of dependencies 
												// Game is a Dependency of GameRunner
		gameRunner.run();

	}

}
