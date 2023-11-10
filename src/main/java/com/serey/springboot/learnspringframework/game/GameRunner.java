package com.serey.springboot.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	//MarioGame game;
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
