package LAB_TASKS;
import java.util.Scanner;

public class LAB2_T1{
	
  public static void main(String[] args) {
	 
	  Scanner input = new Scanner (System.in);
	  
	  System.out.println("enter point: ");
	  double x = input.nextDouble();
	  double y = input.nextDouble();
	  
	  double distance = Math.pow(Math.pow(x, 2)+Math.pow(y, 2), 0.5);
	  
	  if (distance <= 10) {
		  
		  System.out.println("point ("+x+","+y+") is in the circle");
		  
	  }
	  else {
		  
		  System.out.println("point ("+x+","+y+") is not in the circle");
		  
	  }
	  
	  }
	  	
  }