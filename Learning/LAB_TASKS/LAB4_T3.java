package LAB_TASKS;

import java.util.Scanner;		

public class LAB4_T3 {
	
	public static int i = 0;	
	public static int j = 0;	

		public static void main(String[] args) {
			
	Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the number of row and columns of the array: ");
			int x = input.nextInt();
			int y = input.nextInt();
			int index[] = new int[2];
			
			double[][] a = new double[x][y]; 
			
			System.out.println("Enter the array: ");
				
			for( i=0; i<a.length; i++) {
				for( j=0; j<a[i].length; j++) {
					a[i][j] = input.nextDouble();
					index = locateLargest(a);
				}
			}

	        	System.out.print("["+index[0]+","+index[1]+"]");		
		
		}
		
		public static int[] locateLargest(double[][] a) {

			int[] index = new int[2]; 
			int z = 0;
			if (a[i][j] > z) {
				
				index[0] = i;
				index[1] = j;

			}
			
			return index;
		}
	
	}
