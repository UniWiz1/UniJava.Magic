package LAB_TASKS;

public class LAB2_T3 {

	public static void main(String[] args) {

		
		int blank = 8; 
		
		for(int i = 0; i < 8; i++) {	
			for(int j = 1; j <= blank; j++) {
			
				System.out.print(" ");
			
			}
		
			int number = 1;
			
			for(int k = 0; k<=i ; k++) {
			
				System.out.print(number + " ");
				number = number * (i-k)/(k+1);
			}
			
			blank--;
			System.out.println();
			
		}
	}
}