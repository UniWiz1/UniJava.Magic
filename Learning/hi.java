import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class GUI implements ActionListener{
	
	 private JLabel label;
	private JFrame frame;
	private JPanel panel;

	
	public GUI() {
		
		frame = new JFrame();	
		label = new JLabel("idot");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(0,1));
		frame.add (panel, BorderLayout.CENTER);
		frame.setTitle("Calculator");
		frame.pack();
		frame.setVisible (true);
		
	}
public class hi {

	public static void main(String[] args) {
		 double answer = 0.0;
 	  	  
		  String op = JOptionPane.showInputDialog( "what do you want to do" );
		  
		  String firstNumber = JOptionPane.showInputDialog( "Enter first number" );
		  double no1 = Double.parseDouble( firstNumber );

		  
		  String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );
		  double no2 = Double.parseDouble( secondNumber );
			
		  if (op.equals("add")) {  
			  answer = no1+no2;
		  }
		  
		  else if (op.equals("sub")) {
			  answer = no1-no2;
		  }

		  else if (op.equals("mult")) {
			  answer = no1*no2;
			  answer = precission (answer);
		  }
		  
		  else if (op.equals("div")) {
			  answer = no1/no2;
			  answer = precission (answer);
		  }
			  
			 static label.setText("Answer =" + answer);
	}
		  public static double precission(double answer) {
			  
			  Scanner input = new Scanner (System.in);
			  
			  System.out.println("Precission: ");
			  int prec = input.nextInt();
			  answer = answer * (Math.pow(10, prec));
			  answer = (double)((int) answer);
			  answer = answer / (Math.pow(10, prec));

			  return answer;
		  }}}
