
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Suprise implements ActionListener {
	JFrame f = new JFrame();

	JPanel p = new JPanel();

	JButton lb = new JButton();
	JButton rb = new JButton();

	public static void main(String[] args) {
		new Nasty_Suprise().t();
	}

	public void t() {

		f.add(p);

		f.setVisible(true);

		lb.setText("Trick");
		rb.setText("Treat");

		lb.addActionListener(this);

		rb.addActionListener(this);

		p.add(lb);

		p.add(rb);

		f.pack();

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (lb == buttonPressed) {
			System.out.println("Trick");
			showPictureFromTheInternet(
					"https://vignette.wikia.nocookie.net/whatever-you-want/images/d/d8/Cute-kitty-318923.jpg/revision/latest?cb=20130921020409");

		} else if (rb == buttonPressed) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/enEYfMCJtI8/maxresdefault.jpg");

		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}