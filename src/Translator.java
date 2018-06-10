import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Translator implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JTextField tf = new JTextField(20);
	JTextField tf2 = new JTextField(20);
	
	public static void main(String[] args) {
		new Translator().Set();
	}

	public void Set() {
		f.setVisible(true);
		f.setSize(600, 70);
		f.add(p);
		
		p.add(tf);
		p.add(b);
		p.add(tf2);
		f.setTitle("English to Pig Latin");
		b.setText("Translate");
		b.addActionListener(this);
		f.pack();

	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	PigLatinTranslator plt = new PigLatinTranslator();
	
	
	
	tf2.setText(plt.translate(tf.getText()));

	f.pack();
	
	
	
}

}
