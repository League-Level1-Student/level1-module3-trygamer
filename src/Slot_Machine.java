import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	Random y = new Random();
	Random r = new Random();
	Random t = new Random();

	JLabel l = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();

	String Slot1 = "lemon.jpg";
	String Slot2 = "/level1-module3-trygamer/src/cherry.jpg";
	String Slot3 = "/level1-module3-trygamer/src/ bell.jpg";

	public static void main(String[] args) {
		new Slot_Machine().Set();
	}

	public void Set() {

		f.setVisible(true);
		f.add(p);
		p.add(l);
		p.add(l2);
		p.add(l3);
		p.add(b1);

		b1.setText("SPIN");
		b1.addActionListener(this);
		f.pack();
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hi");
		int r = y.nextInt(3);
		int v = y.nextInt(3);
		int b = y.nextInt(3);

		l = loadImageFromComputer(Slot1);
		// if (r == 1) {
		// l.add(loadImageFromComputer(Slot1));
		// } else if (r == 2) {
		// l.add(loadImageFromComputer(Slot2));
		// } else if (r == 0) {
		// l.add(loadImageFromComputer(Slot3));
		// }
		// if (v == 1) {
		// l2.add(loadImageFromComputer(Slot1));
		// } else if (v == 2) {
		// l2.add(loadImageFromComputer(Slot2));
		// } else if (v == 0) {
		// l2.add(loadImageFromComputer(Slot3));
		// }
		// if (b == 1) {
		// l3.add(loadImageFromComputer(Slot1));
		// } else if (b == 2) {
		// l3.add(loadImageFromComputer(Slot2));
		// } else if (b == 0) {
		// l3.add(loadImageFromComputer(Slot3));
		// }
		f.pack();
	}

}
