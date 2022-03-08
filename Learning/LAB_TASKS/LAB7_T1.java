package LAB_TASKS;

import java.util.Scanner;

public class LAB7_T1 {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        int n1 = 0;
        int n2 = 0;
        
        while(true) {
            System.out.print("Please enter 2 numbers");  
            
            try {
                n1 = input.nextInt();
                n2 = input.nextInt();
                
                break;
            } 
            
            catch (java.util.InputMismatchException error) {
               System.out.printf("error %n");
               input.nextLine(); 
            }
        } 
        
        System.out.printf("The sum is %d%n", (n1+n2));
    }
}
