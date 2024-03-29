package com.c4labz.pakkuman2.stage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Graphical {

	private int x = 0;
	private int y = 0;
	public int width = 0;
	public int height = 0;
	private Texture texture;

	// Tile setup
	final int WIDTH_OF_TILE = Gdx.graphics.getWidth()/20;
	final int HEIGHT_OF_TILE = Gdx.graphics.getHeight()/15;

	private Object lock;

	public Graphical(int xStartTile, int yStartTile, Texture texture) {

		this.x = xStartTile * WIDTH_OF_TILE;
		this.y = yStartTile * HEIGHT_OF_TILE;
		this.texture = texture;

		lock = new Object();
	}

	public boolean collidesWith(Graphical graphical) {

		synchronized (lock) {
		    if(this.getX() + this.width > graphical.getX()
		    		&& this.getX() < graphical.getX()+graphical.width){
		    	return true;
		    }
		    else  if(this.getY() + this.height > graphical.getY()
		    		&& this.getY() < graphical.getY()+graphical.height){
		    	return true;
		    }
		}
		return false;
	}

	public boolean collidesWith(Graphical[] graphicals) {

		for (Graphical g : graphicals) {
			if (this.collidesWith(g)) {
				return false;
			}
		}
		return true;
	}

	public boolean setCoordinates(int x, int y) {

		synchronized (lock) {
			this.x = x;
			this.y = y;
		}
		return true;
	}

	public boolean setX(int x) {

		synchronized (lock) {
			this.x = x;
		}
		return true;
	}

	public boolean setY(int y) {
		
		synchronized (lock) {
			this.y = y;
		}
		return true;
	}

	public int getX() {

		int toReturn;

		synchronized (lock) {
			toReturn = x;
		}

		return toReturn;
	}

	public int getY() {

		int toReturn;

		synchronized (lock) {
			toReturn = y;
		}

		return toReturn;
	}
	
	public Texture getTexture() {

		Texture toReturn;

		synchronized (lock) {
			toReturn = texture;
		}

		return toReturn;
	}
}
