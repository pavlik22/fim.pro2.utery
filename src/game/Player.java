package game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Player {
	public static final int WIDTH = 40;
	public static final int HEIGHT = 33;
	//Velikost skoku hráèe
	private static final int COEF_ACCELERATION = 1;
	//rychlost pádu hráèe
	private static final int COEF_SPEED = 2;
	private BufferedImage img = null;
	//poèáteèní x-ová souøadnice/pozice hráèe, nemìní se(protože hráèe neskáèe dopøedu, dozadu)
	private int x;
	//poèáteèní y-ová souøadnice/pozice hráèe (skáèe nahoru, dolu)
	private int y;
	private int speed;
	
	public Player(BufferedImage img) {
		this.img = img;
		y = PlayGround.HEIGHT / 2;
		x = (PlayGround.WIDTH / 2) - (img.getWidth() / 2);
		
		speed = COEF_SPEED;
	}
	/*
	 * volá se po nárazu do zdi, nebo kraje okna.. resetování hráèe
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
	 * Zajistuje pohyb hráèe
	 */
	public void move() {
		speed = speed + COEF_ACCELERATION;
		y = y + speed;
	}
	
	/*
	 * vykreslení hráèe
	 */
	public void paint(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public int getPlayersHeight() {
		return img.getHeight();
	}
	
	/*
	 * vrací pomyslny ètverec/obdelnik, který opisuje hráèe
	 */
	public Rectangle getLimit() {
		return new Rectangle(x, y, img.getWidth(), img.getHeight());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
