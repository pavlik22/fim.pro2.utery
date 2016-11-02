package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Player {
	public static final int WIDTH = 40;
	public static final int HEIGHT = 33;
	//Velikost skoku hr��e
	private static final int COEF_ACCELERATION = 1;
	//rychlost p�du hr��e
	private static final int COEF_SPEED = 2;
	private BufferedImage img = null;
	//po��te�n� x-ov� sou�adnice/pozice hr��e, nem�n� se(proto�e hr��e nesk��e dop�edu, dozadu)
	private int x;
	//po��te�n� y-ov� sou�adnice/pozice hr��e (sk��e nahoru, dolu)
	private int y;
	private int speed;
	
	public Player(BufferedImage img) {
		this.img = img;
		y = PlayGround.HEIGHT / 2;
		x = (PlayGround.WIDTH / 2) - (img.getWidth() / 2);
		
		speed = COEF_SPEED;
	}
	/*
	 * vol� se po n�razu do zdi, nebo kraje okna.. resetov�n� hr��e
	 */
	public void reset() {
		y = PlayGround.HEIGHT / 2;
		speed = COEF_SPEED;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void jump() {
		speed = -17;
	}
	
	/*
	 * Zajistuje pohyb hr��e
	 */
	public void move() {
		speed = speed + COEF_ACCELERATION;
		y = y + speed;
	}
	
	/*
	 * vykreslen� hr��e
	 */
	public void paint(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public int getPlayersHeight() {
		return img.getHeight();
	}
	
	/*
	 * vrac� pomyslny �tverec/obdelnik, kter� opisuje hr��e
	 */
	public Rectangle getLimit() {
		return new Rectangle(x, y, img.getWidth(), img.getHeight());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
