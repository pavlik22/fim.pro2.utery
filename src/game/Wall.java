package game;

import java.awt.image.BufferedImage;

public class Wall {

	public static final int WIDTH = 45;
	//rychlost pohybu zdi
	public static final int SPEED = -6;
	//mezera mezi horn� a doln� �asti zdi
	public static final int GAP = 200;
	
	//TODO
	
	//r�zn� zdi, r�zn� obr�zky => nelze pou�it static
	private static BufferedImage img = null;
	//x-ova sou�adnice zdi (m�n� se zprava doleva)
	private int x; 
	//y-ova sou�adnice zdi (horni souradnice spodni casti zdi)
	private int y;
	private int height;
	
	//constructor
	public Wall(int vzdalenostZdiOdZacatkuHraciPlochy) {
		this.x = vzdalenostZdiOdZacatkuHraciPlochy;
		
		
	}

}
