import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor implements KeyListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	char currentLetter= generateRandomLetter();

	
	
	
	
	public static void main(String[] args) {

		new Typing_Tutor().Set();
		
	}

	public  void Set() {
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setTitle("Type or Die");
		f.add(p);
		f.addKeyListener( this);
		p.add(l);

		l.setText(String.valueOf(currentLetter));
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);
		f.pack();
		
		

	}

	public void keyPressed(KeyEvent e) {
		
		
		System.out.println(e.getKeyChar());
		
		
		if(currentLetter==e.getKeyChar()){
			
			System.out.println("correct");
			
			f.setBackground(Color.green);
			
		
	
		}
		
		else {
			f.setBackground(Color.red);
			
		}
		currentLetter= generateRandomLetter();
		l.setText(String.valueOf(currentLetter));
		f.repaint();
	f.pack();
		
	
	}
	
	
	char generateRandomLetter() {
		 Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
}


	
		
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}