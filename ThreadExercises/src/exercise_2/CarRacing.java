package exercise_2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CarRacing extends JApplet{

	private CarPanel carPanel1 = new CarPanel();
	private CarPanel carPanel2 = new CarPanel();
	private CarPanel carPanel3 = new CarPanel();
	private CarPanel carPanel4 = new CarPanel();
	private JTextField jTextField1 = new JTextField("100");
	private JTextField jTextField2 = new JTextField("100");
	private JTextField jTextField3 = new JTextField("100");
	private JTextField jTextField4 = new JTextField("100");
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new CarRacing());
		frame.setTitle("Exercise02");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public CarRacing() {
		JPanel panel2 = new JPanel(new GridLayout(1, 8));
		jTextField1.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					carPanel1.setSpeed(Integer.parseInt(jTextField1.getText()));					
				} catch (NumberFormatException e2) {
				}
			}
		});
		jTextField2.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					carPanel2.setSpeed(Integer.parseInt(jTextField2.getText()));					
				} catch (NumberFormatException e2) {
				}
			}
		});
		jTextField3.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					carPanel3.setSpeed(Integer.parseInt(jTextField3.getText()));					
				} catch (NumberFormatException e2) {
				}
			}
		});
		jTextField4.addKeyListener(new KeyAdapter() {			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					carPanel4.setSpeed(Integer.parseInt(jTextField4.getText()));					
				} catch (NumberFormatException e2) {
				}
			}
		});
		
		panel2.add(new JLabel("Car 1: ", JLabel.RIGHT));
		panel2.add(jTextField1);
		panel2.add(new JLabel("Car 2: ", JLabel.RIGHT));
		panel2.add(jTextField2);
		panel2.add(new JLabel("Car 3: ", JLabel.RIGHT));
		panel2.add(jTextField3);
		panel2.add(new JLabel("Car 4: ", JLabel.RIGHT));
		panel2.add(jTextField4);
		add(panel2, BorderLayout.NORTH);
		JPanel panel1 = new JPanel(new GridLayout(4, 1));
		panel1.add(carPanel1);
		panel1.add(carPanel2);
		panel1.add(carPanel3);
		panel1.add(carPanel4);
		add(panel1, BorderLayout.CENTER);
	}
	


}
