package com.serey.springboot.learnspringframework;

import com.serey.springboot.learnspringframework.game.GameRunner;
import com.serey.springboot.learnspringframework.game.MarioGame;
import com.serey.springboot.learnspringframework.game.PacmanGame;
import com.serey.springboot.learnspringframework.game.SuperContraGame;

public class AppGamingBasiscJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
