package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Timer;

import picture.Picture;
import picture.PictureFileSource;

public class PlayGround extends JPanel{
	public static final boolean DEBUG = true;  //pomocn� konstanta pro testov�n�,debugov�n�
	public static final int HEIGHT = 800;
	public static final int WIDTH = 600;
	
	//rychlost behu pozadi
	public static final int SPEED = -2;
	
	//TODO
	
	private Player player;
	private BufferedImage imgBackground;
	private Timer AnimationTimer;
	private boolean pause = false;
	private boolean gameRuns = false; //hra b��
	private int moveBackgroundX = 0; //posun pozad�
	
	public PlayGround() {
		PictureFileSource z = new PictureFileSource();
		z.fillMap();
		z.setSource(Picture.BACKGROUND.getKey());
		try {
			imgBackground = z.getPicture();
		} catch (IOException e){
			e.printStackTrace();
		
		}
		
		z.setSource(Picture.PLAYER.getKey());
		BufferedImage imgPlayer;
		//player = new Player(null);
		try {
			imgPlayer = z.getPicture();
			player = new Player(imgPlayer);
		} catch (IOException e){
			e.printStackTrace();
		
		}
		
		
		
		
		
	
	}
	
	public void paint(Graphics g) { 
		super.paint(g);
		
		//dve pozadi za sebe pro plynule prechody
		//prvni
		g.drawImage(imgBackground, moveBackgroundX, 0, null);
		//druhe je posunuto o sirku obrazku
		g.drawImage(imgBackground, moveBackgroundX+imgBackground.getWidth(), 0, null);
		
		if (PlayGround.DEBUG) {
			g.setColor(Color.WHITE);
			g.drawString("moveBackgroundX="+moveBackgroundX, 0, 10);
			
		}
		
		
		player.paint(g);
		
	}
	
	private void move() {
		if ( ! pause && gameRuns ) {
			
			//TODO
			player.move();
			
			//posun pozice pozadi hraci plochy (skrolovani)
			moveBackgroundX = moveBackgroundX + PlayGround.SPEED;
			//kdy� se pozadi cele doposouva, za�ni od za��tku
			if (moveBackgroundX == -imgBackground.getWidth()) {
				moveBackgroundX = 0;
				
			}
		}
	}
	
	//STARTOVACI METODA
	private void startGame() {
		AnimationTimer = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				move();
				
			}
		});
		
		gameRuns = true;
		AnimationTimer.start();
		
	}
	
	public void setPlayGround() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (e.getButton() == MouseEvent.BUTTON1) {
					player.jump();
					//TODO skok hr��e - leve tla��tko
				} 
				//pauza
				if (e.getButton() == MouseEvent.BUTTON3) {

					if (gameRuns) {
						if (pause) {
							pause = false;
						} else {
							pause = true;
						}
						
					} else {
						setNewGame();
						startGame();
						
						
					}
				}
			}
			
		});
		
		setSize(WIDTH, HEIGHT);
		
	}

	protected void setNewGame() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
