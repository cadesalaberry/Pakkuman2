package com.c4labz.pakkuman2.stage;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class PacMan extends Moveable {

	private int score;
	private int lives;
	private String mode;

	public PacMan(int x, int y, Texture texture) {
		super(x, y, texture);
	
	}
	
	public PacMan(int x, int y) {
		
		this(x,y,new Texture("data/pacman.png"));
	
	}
	
}