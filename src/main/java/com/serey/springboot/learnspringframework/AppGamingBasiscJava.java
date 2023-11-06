package com.serey.springboot.learnspringframework;

import com.serey.springboot.learnspringframework.game.GameRunner;
import com.serey.springboot.learnspringframework.game.MarioGame;

public class AppGamingBasiscJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
