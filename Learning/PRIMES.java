import java.util.Scanner;

public class PRIMES {

	public static void main(String[] args) {
		
		int k = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
				
		for (int i = 1; i<number; i++) {
			
			for (int j = 1; j<i ; j++) {
				
				if (i%j==0) {
					k=k+1;
				}
				else {}
			}
			
			if (k<2) {
		        System.out.println(i);
				k=0;
			}
			else {
				k = 0;
			}
		}
	}
}