package game;

import java.awt.image.BufferedImage;

public class Wall {

	public static final int WIDTH = 45;
	//rychlost pohybu zdi
	public static final int SPEED = -6;
	//mezera mezi horní a dolní èasti zdi
	public static final int GAP = 200;
	
	//TODO
	
	//rùzné zdi, rùzné obrázky => nelze použit static
	private static BufferedImage img = null;
	//x-ova souøadnice zdi (mìní se zprava doleva)
	private int x; 
	//y-ova souøadnice zdi (horni souradnice spodni casti zdi)
	private int y;
	private int height;
	
	//constructor
	public Wall(int vzdalenostZdiOdZacatkuHraciPlochy) {
		this.x = vzdalenostZdiOdZacatkuHraciPlochy;
		
		
	}

}
