package com.serey.springboot.learnspringframework;

import com.serey.springboot.learnspringframework.game.GameRunner;
import com.serey.springboot.learnspringframework.game.MarioGame;
import com.serey.springboot.learnspringframework.game.SuperContraGame;

public class AppGamingBasiscJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();

	}

}
