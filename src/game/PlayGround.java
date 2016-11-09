package game;

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
	public static final int HEIGHT = 800;
	public static final int WIDTH = 600;
	
	//rychlost behu pozadi
	public static final int SPEED = -2;
	
	//TODO
	
	
	private BufferedImage imgBackground;
	private Timer AnimationTimer;
	private boolean pause = false;
	private boolean gameRuns = false; //hra bìží
	private int moveBackgroundX = 0; //posun pozadí
	
	public PlayGround() {
		PictureFileSource z = new PictureFileSource();
		z.fillMap();
		z.setSource(Picture.BACKGROUND.getKey());
		try {
			imgBackground = z.getPicture();
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
		
		
	}
	
	private void move() {
		if ( ! pause && gameRuns ) {
			
			//TODO
			
			
			//posun pozice pozadi hraci plochy (skrolovani)
			moveBackgroundX = moveBackgroundX + PlayGround.SPEED;
			//když se pozadi cele doposouva, zaèni od zaèátku
			if (moveBackgroundX == -imgBackground.getWidth()) {
				moveBackgroundX = 0;
				
			}
		}
	}
	
	//STARTOVACI METODA
	private void StartGame() {
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
					//TODO skok hráèe - leve tlaèítko
				} 
				
				if (e.getButton() == MouseEvent.BUTTON3) {

					if (gameRuns) {
						if (pause) {
							pause = false;
						} else {
							pause = true;
						}
						
					} else {
						setNewGame();
						StartGame();
						
						
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
