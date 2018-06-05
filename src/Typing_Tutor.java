import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	char currentLetter= generateRandomLetter();

	
	
	
	
	public static void main(String[] args) {

		new Typing_Tutor().Set();
		
	}

	public  void Set() {
		
		f.setVisible(true);
		f.setTitle("Type or Die");
		f.add(p);
		p.add(l);
		l.setText(System.out.print(currentLetter));
		f.pack();
		

	}

 ;
	
	
	char generateRandomLetter() {
		 Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
}
}