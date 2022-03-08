import java.util.Scanner;

public class WordGradeFromNumber{

  public static void main(String[] args) {
	  
	  Scanner input = new Scanner (System.in);
	  
	  System.out.println("enter a number: ");
	  double number = input.nextDouble();
	  
	  if (number >90) {
		  System.out.println("good");
	  }
		  else if (number>80) {
			  System.out.println("satisfactory");
			  }
			  
		  	else {
				  System.out.println("fucking diot");
		  	}
			  
	  }
	  
  }

