package LAB_TASKS;
import java.util.Scanner;

public class LAB3_T2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		boolean q = isPalindrome(number);
		
		if (q == true) {
			
			System.out.println("yes");
			
		}
		
		else {
			
			System.out.println("no");
			
		}

		}
	
	
	public static int manyDigits(int number) {
		
		int x = 0;
		
		while (number > 0) {
			
			number = number/10;
			x++;
				
		}
		return x;
	}
	
	public static int reverse(int number) {
		
		int x = manyDigits (number);
		int reverse = 0;
		
		while (number > 0) {
		
		int digit = number % 10;
		number = number/10;
		int newDigit = digit * (int) Math.pow(10, x-1);
		reverse = reverse + newDigit;
		x=x-1;
		
		}
		return reverse;
	}
	
	
	public static boolean isPalindrome(int number) {
		
		int reverse = reverse(number);
		
		if (reverse == number) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	}

