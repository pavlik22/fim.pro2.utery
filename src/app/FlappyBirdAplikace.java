package app;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import game.PlayGround;

public class FlappyBirdAplikace extends JFrame{
	private PlayGround pg;
	
	public FlappyBirdAplikace() {
		//TODO
	}
	
	public void initGUI() {
		setSize(PlayGround.WIDTH, PlayGround.HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FlappyAplication");
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void start() {
		pg = new PlayGround();
		pg.setPlayGround();
		
		getContentPane().add(pg, "Center");
		pg.setVisible(true);
		this.revalidate();
		this.repaint();
		
		
		pg.setPlayGround();
		
	}

	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				FlappyBirdAplikace app = new FlappyBirdAplikace();
				app.initGUI();
				
			}
			
		});
	}

}
