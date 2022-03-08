package LAB_TASKS;

public class LAB2 {

	public static void main(String[] args) {
		
		int num = 1;
		int den = 3;
		double sum = 0;
		double answer = 0;
		
		for (num = 1 ; num <= 97; num += 2) {
			
			sum = (double)sum + (double)(num/(num+2));
			
		}
		
		System.out.println(sum);
		
	}

}