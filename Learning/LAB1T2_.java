import java.util.Scanner;

public class LAB1T2_{

  public static void main(String[] args) {
	  
	  System.out.println("Enter three point for a triangle: ");
	  Scanner input = new Scanner (System.in);
	
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
		
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();
	
	double side1 = (Math.pow(Math.pow(x1-y1, 2) + (Math.pow(x2-y2, 2)), 0.5));
	
	double side2 = (Math.pow(Math.pow(x2-y2, 2) + (Math.pow(x3-y3, 2)), 0.5));

	double side3 = (Math.pow(Math.pow(x3-y3, 2) + (Math.pow(x1-y1, 2)), 0.5));
	
	double s = (side1 + side2 + side3)/2;
	
	double q = s*(s-side1)*(s-side2)*(s-side3);

	double what = Math.pow(q, 0.5);
	
	System.out.println("the area of the triangle is " + what);
	  
	  }
	  	
  }