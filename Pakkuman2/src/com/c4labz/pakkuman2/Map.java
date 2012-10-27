package com.c4labz.pakkuman2;

import java.io.File;

public class Map {

	int[][] mapArray;
	int[][] defaultMapArray ={
			{1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1},
			};
	
	public Map(File map){
		readFile(map);
		checkMapSize();
		checkMapCoherence();
		load();
	}
	
	private void readFile(File file) {
		if(file.canRead()){
			//File to Array.
		}
		// TODO Auto-generated method stub
		
	}

	public Map(){
		this(new File("./assets/default-map"));
	}

	private void load(){
		for(int x=0; x<mapArray.length;x++){
			for(int y=0; y<mapArray[x].length;x++){
				switch(mapArray[x][y]){
				case 0:{
					
				}
				case 1:{
					
				}
				case 2:{
					
				}
				case 3:{
					
				}
				}
			}
		}
	}

	private void checkMapCoherence() {
		// TODO Auto-generated method stub
		
	}

	private void checkMapSize() {
		// TODO Auto-generated method stub
		
	}
}
