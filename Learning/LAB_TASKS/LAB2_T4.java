package LAB_TASKS;

import java.util.Scanner;

public class LAB2_T4{
	
  public static void main(String[] args) {
	  	  
	  int x = 0;
	  int check = 0;
	  
	  Scanner input = new Scanner (System.in);
	  
	  System.out.println("enter your number");
	  double number = input.nextDouble();
	  
	  if (number < 0) {
		  number = number * -1;
		  check = 1;
	  }
	  
	  int firstDigit =(int) number%10;
	 
	  while (number>10) {
		  
		  number = number/10;
		  x++;
		  }
	  
	 while (number > 10) {
		 
		 number = number%Math.pow(10, x);
		 x--;
		 
	 }
	 int lastDigit = (int) number;
	 
	 if (check == 1) {
		 
		 lastDigit = -1 * lastDigit;
		 
	 }
	 
	 System.out.println("sum is: " + (lastDigit+firstDigit));
 
	  }
	  	
  }