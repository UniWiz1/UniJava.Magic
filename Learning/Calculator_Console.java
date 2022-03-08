import java.util.Scanner;

public class Calculator_Console{

  public static void main(String[] args) {
	  double answer = 0.0;
	  	  
	  Scanner input = new Scanner (System.in);
	  
	  System.out.println("What do you want to do");
	  String op = input.nextLine();
	  
	  System.out.println("enter first number");
	  double no1 = input.nextDouble();
	  
	  System.out.println("enter second number");
	  double no2 = input.nextDouble();
		
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
	  
	  System.out.println("Answer is: " + answer);
	  
	  
	  }
  
  public static double precission(double answer) {
	  
	  Scanner input = new Scanner (System.in);
	  
	  System.out.println("Precission: ");
	  int prec = input.nextInt();
	  answer = answer * (Math.pow(10, prec));
	  answer = (double)((int) answer);
	  answer = answer / (Math.pow(10, prec));

	  return answer;
  }
  
  
	  
  }