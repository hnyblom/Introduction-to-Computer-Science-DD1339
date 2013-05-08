package net.pedrosfyr.hnochsf;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Tile {
	
	public static int[] blank = {-1, -1};
	
	//backgound
	public static int[] grass = {0, 0};
	public static int[] road = {1, 0};
	public static int[] leaves = {2, 0};
	
	//collsion
	public static int[] shrub = {0, 0};
	public static int[] rock = {1, 0};
	public static int[] stump = {2, 0};
	
	//items
	
	
	//characters
	
	
	public static int size = 32;
	public static BufferedImage terrain, background, items, characters;
	
	public Tile(){
		
		try{
			Tile.background = ImageIO.read(new File("res/background.png"));
			//Tile.terrain = ImageIO.read(new File("res/terrain.png"));
			Tile.characters = ImageIO.read(new File("res/characters.png"));
			//Tile.items = ImageIO.read(new File("res/items.png"));
		}catch(Exception e){
			System.out.println("Error Loading Images");
		}
		
	}

}
