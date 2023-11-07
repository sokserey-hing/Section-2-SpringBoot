package com.serey.springboot.learnspringframework.game;

public class App01GamingBasiscJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); //1. Object creation 
		
		var gameRunner = new GameRunner(game); //2. Object creation + wiring of dependencies 
												// Game is a Dependency of GameRunner
		gameRunner.run();

	}

}
