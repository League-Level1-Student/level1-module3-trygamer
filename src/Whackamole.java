import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
JFrame f;
JPanel p;
	Random y = new Random();
	JButton b;
	JButton mole;
	int num;
	int hit;
	
	Date d;
	
public static void main(String[] args) {
	new Whackamole().drawButtons();
}



	
	

	public  void drawButtons( ){
		f= new JFrame();
		p= new JPanel();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(300, 300);
		f.add(p);
		
		 num = y.nextInt(23);
		System.out.println(num);
		for(int i=0; i<23; i++ ) {
			 b = new JButton();
			p.add(b);
			
			b.addActionListener(this);
			if(i==num) {
				b.setText("mole!");
				mole = b;
				
				
			}
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		Date d = new Date();
		
		if(buttonPressed== mole) {
			
			playSound("114685__qat__whack04 (1).mp3");
			 hit += 1;
			 System.out.println(hit);
		}
		else {
			speak("you missed");
			
			
		}
		
		f.dispose();
		
		drawButtons();gggg
		
		
		if(hit==10) {
			
			
			endGame(d,10 );
		}
		
	}
	
	
	
	
	
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

}



