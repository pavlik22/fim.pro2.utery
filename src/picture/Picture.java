package picture;

import java.awt.Color;
import java.util.prefs.BackingStoreException;


import game.PlayGround;
import game.Player;

public enum Picture {
	PLAYER("player", Player.WIDTH, Player.HEIGHT, new Color(255, 255, 255)),
	BACKGROUND("background", PlayGround.WIDTH*3, PlayGround.HEIGHT, new Color(0, 0, 150));
	
	//poèet prvkù
	private static final int size = Picture.values().length;
	
	//pole pro iteraci
	private static final Picture[] pictures = Picture.values();
	
	
	
	private final String key;
	private final int width;
	private final int height;
	private final Color color;
	
	
	private Picture(String key, int width, int height, Color color) {
		this.key = key;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public String getKey() {
		return key;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}
	
	public static int getSize() {
		return size;
	}
	 
	public static Picture[] getPictures() {
		return pictures;
	}
	
	
	
}
