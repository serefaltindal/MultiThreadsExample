package exercise_4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BouncingBall extends JPanel implements Runnable{

	public final int BALL_SIZE=20;
	private String color;
	private int maxHigh=550;
	private int minHigh=100;
	private int yPos=100;
	private int xPos=250;
	public int speed=100;
	
	
	public BouncingBall() {
		Thread thread = new Thread(this);
		thread.start();		
	}
	
	
	@Override
	public void run() {
		try {
			initUi();
			while(true) {
				while(yPos<maxHigh ) {
					repaint();
					yPos=yPos+2;
					Thread.sleep(1*(speed));	
				}
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initUi() {

		Border blackBorder=BorderFactory.createLineBorder(Color.BLACK,1);
		this.setBorder(blackBorder);		
		this.setSize(500, 600);
	}
	
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(xPos,yPos, BALL_SIZE, BALL_SIZE);

	}


	public void setSpeed(int speed) {
		if(speed<1) {
			speed=1;
		}else if(speed>100) {
			speed=100;
		}
		this.speed = speed;
	}

}
