package exercise_4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import exercise_2.CarRacing;

public class Run extends JPanel{

	public static JTextField text1=new JTextField("100",10);
	public static JTextField text2=new JTextField("100",10);
	public static JPanel ball1=new BouncingBall();
	public static JPanel ball2=new BouncingBall();
	
	
	public static void main (String args[]) {
		
		JFrame frame = new JFrame();
		frame.add(new Run());
		frame.setTitle("Bounce Ball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public Run() {
		GridLayout experimentLayout = new GridLayout(0,2);
		Border blackBorder=BorderFactory.createLineBorder(Color.black);
		this.setLayout(experimentLayout);
		this.setBorder(blackBorder);
		
		text1.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					((BouncingBall) ball1).setSpeed(Integer.parseInt(text1.getText()));					
				} catch (NumberFormatException e2) {
				}
			}
		});
		
		text2.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					((BouncingBall) ball2).setSpeed(Integer.parseInt(text2.getText()));					
				} catch (NumberFormatException e2) {
				}
			}
		});
		
		ball1.add(text1);
		this.add(ball1);
		ball2.add(text2);
		this.add(ball2);	
	}
}
