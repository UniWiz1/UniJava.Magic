import java.util.Scanner;

public class LAB1T2 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner (System.in);
			System.out.println("Enter investment amount: ");
			double investmentAmount = input.nextDouble();
			
			System.out.println("Enter annual interest rate in percentage: ");
			double annualInterestRate = input.nextDouble();
			
			System.out.println("Enter number of years: ");
			int numberOfYears = input.nextInt();
			
			double future = investmentAmount * (Math.pow(1.00 + annualInterestRate/100.0/12.0, numberOfYears*12));
			future = future*100;
			future = (double)((int) future);
			future = future /100;
			System.out.println("Accumulated value is $" + future);
		
		
	}

}
