import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	static JFrame f = new JFrame();
	static JPanel p = new JPanel();
	static JButton b1 = new JButton();
	static JButton b2 = new JButton();

	public static void main(String[] args) {
		new Chuckle_Clicker().makeButtons();
	}

	private void makeButtons() {

		f.setVisible(true);
		f.add(p);
		p.add(b1);
		p.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b1.setText("joke");
		b2.setText("punchline");
		f.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		JButton bp = (JButton) arg0.getSource();

		if (bp == b1) {
			JOptionPane.showMessageDialog(null, "Q: What happens when fog lifts in California?\n" + "\n" + "A: UCLA!");

		} else {

			JOptionPane.showMessageDialog(null,
					"Breakin in cribs with a crowbar I wasn’t ‘poor’, I was po', I couldn’t afford the ‘o-r’");

		}

	}
}
