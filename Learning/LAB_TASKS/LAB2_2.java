 package LAB_TASKS;

public class LAB2_2 {

	public static void main(String[] args) {
		
		int x = 0;		
		
		for (int i = 1; i < 7;i++) {
			
			for (int j = i + 1; j <= 7; j++) {
				
				System.out.print(i + " ");
				System.out.println(j);
				x++;
				
			}
			
		}
		
		System.out.println("number of combinations: " + x);
		
	}

}