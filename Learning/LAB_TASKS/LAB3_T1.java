package LAB_TASKS;

import java.util.Scanner;

public class LAB3_T1 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("enter number");
		int n = input.nextInt();
		
		int answer = sumDigits(n);
		
		System.out.println("sum is: " + answer);
		
	}
	
	public static int sumDigits(long n) {
	
		int sum = 0;
		
		while (n>0) {
			
			int digit =(int) n%10;
			n = n/10;
			sum = sum + digit;
			
		}
		
		return sum;
	}
	
	}

