package flashing;

import java.util.Date;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class FlashingText extends JApplet implements Runnable{

	private JLabel label=new JLabel("WELCOME",JLabel.CENTER);
	
	public FlashingText() {
		add(label);
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		while(true) {
			if(label.getText()==null) {
				label.setText(new Date().toString());
			}else {
				label.setText(new Date().toString());
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
