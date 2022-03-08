import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI{
	
	public GUI() {
		
		JFrame frame = new JFrame();
		frame.setSize(100, 100);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JTextField numberOF = new JTextField(20);
		numberOF.setBounds(100,20,165,25);
		JTextField numberTF = new JTextField(20);
		numberTF.setBounds(100,20,165,25);
		JLabel num1 = new JLabel("num1");
		num1.setBounds(10,20,80,25);
		JLabel op = new JLabel("op");
		op.setBounds(10,20,80,25);

		JLabel num2 = new JLabel("num2");
		num2.setBounds(10,20,80,25);



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add (panel, BorderLayout.CENTER);
		frame.setTitle("Calculator");
		frame.setVisible (true);
		
		panel.add(numberOF);
		panel.add(numberTF);
		panel.add(num1);
		panel.add(op);
		panel.add(num2);

		
	}
	
  public static void main(String[] args) {
	 
	  new GUI ();
	  
	  }
	  	
  }