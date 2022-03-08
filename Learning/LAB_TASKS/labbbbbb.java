package LAB_TASKS;

import java.util.Scanner;

public class labbbbbb {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter number: ");
		int n = input.nextInt();
		
		System.out.println(mult(n));
	
		}
	
	
	public static int mult(int n) {
		
		int sumSquare = 0;
		int digit = 0;
		int mult = 1;
					
		while (n>0) {
			
			digit =(int) n%10;
			n = n/10;
			mult = mult * digit;
			
		}
		
		return mult;
		
		
	}

	}

