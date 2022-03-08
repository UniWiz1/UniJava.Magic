package LAB_TASKS;

import java.util.Scanner;

public class LAB3_T3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter number: ");
		int n = input.nextInt();
		boolean happy = isHappy(n);
		
		if (happy == true) {
			
			System.out.println("The number is happy");
			
		}
		
		else {
			
			System.out.println("The number is sad");
			
			}
		
		}
	
	
	public static boolean isHappy(long n) {
		
		int sumSquare = 0;
		boolean happy = false;
		int digit = 0;
		
		while (sumSquare != 1 && sumSquare != 4) {
			
			sumSquare = 0;
			
		while (n>0) {
			
			digit =(int) n%10;
			n = n/10;
			sumSquare = sumSquare + (int) Math.pow(digit, 2);
			
		}
		
		n = sumSquare;
		}
		
		if (sumSquare == 1) {
			
			happy = true;
			
		}
		
		else {
			
			happy = false;
			
		}
		
		return happy;
	}

	}

