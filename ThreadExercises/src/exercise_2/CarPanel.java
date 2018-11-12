package exercise_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class CarPanel extends JPanel implements Runnable {

	private int yPos;
	private int xPos;
	private int size = 20;
	private int speed = 100;
	private boolean firstRun = true;
	private static final long serialVersionUID = 1L;

	public CarPanel() {
		setBorder(new LineBorder(Color.BLACK));
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void setSpeed(int speed) {
		if (speed < 1) {
			speed = 1;
		}
		this.speed = speed;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (firstRun) {
			xPos = - 1* size;
			firstRun = false;
		}
		yPos = getHeight();
		g.setColor(Color.BLACK);
		g.fillOval(xPos + size, yPos - size, size, size);
		g.fillOval(xPos + 3 * size, yPos - size, size, size);
		g.setColor(Color.RED);
		g.fillRect(xPos, yPos - 2 * size, 5 * size, size);
		g.setColor(Color.BLUE);
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(speed);
				xPos += 1;
				if (xPos >= getWidth()) {
					xPos = -5 * size;
				}
				repaint();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 }


	
}
