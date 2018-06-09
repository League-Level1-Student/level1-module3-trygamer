import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
int ans;
JFrame f = new JFrame();
JPanel p = new JPanel();
JTextField num1 = new JTextField(20);
JTextField num2 = new JTextField(20);
JButton b1= new JButton();
JButton b2= new JButton();
JButton b3= new JButton();
JButton b4= new JButton();
int n2;
int n1;
void Set(){
	f.setVisible(true);
	
	f.add(p);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	p.add(num1);
	p.add(num2);
	f.pack();
	b1.setText("add");
	b2.setText("sub");
	b3.setText("mul");
	b4.setText("div");
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	String s1 =num1.getText();
	String s2 =num2.getText();
	 n1 = Integer.parseInt(s1);
	 n2 = Integer.parseInt(s2);
	f.pack();
	


	
}
public static void main(String[] args) {
	
	new Calculator().Set();
	
	
}

public void actionPerformed(ActionEvent arg0) {
	
	JButton buttonPressed = (JButton) arg0.getSource();

	
	if(buttonPressed== b1) {
		String s1 =num1.getText();
		String s2 =num2.getText();
		 n1 = Integer.parseInt(s1);
		 n2 = Integer.parseInt(s2);
		add();
		
	}
	
	else 	if(buttonPressed== b2) {
		String s1 =num1.getText();
		String s2 =num2.getText();
		 n1 = Integer.parseInt(s1);
		 n2 = Integer.parseInt(s2);
		sub();
	}
	else if(buttonPressed== b3) {
		String s1 =num1.getText();
		String s2 =num2.getText();
		 n1 = Integer.parseInt(s1);
		 n2 = Integer.parseInt(s2);
		mul();
	}
	else if(buttonPressed== b4) {
		String s1 =num1.getText();
		String s2 =num2.getText();
		 n1 = Integer.parseInt(s1);
		 n2 = Integer.parseInt(s2);
		div();
	}
	f.pack();
	System.out.println(ans);
}



	
	public void add(){
		
		 ans = n1+n2;
		
	}
	
public void sub(){
		
		 ans = n1-n2;
	
}
public void mul(){
	
	 ans = n1*n2;
}
	
public void div(){
		
		 ans = n1/n2;
}

}
