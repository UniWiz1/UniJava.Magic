public class LAB1T1 {

	public static void main(String[] args) {
		double PI=0.0;
		int odd = 1;
		for (int i=1;i<=15;i++) {
			
			double termValue=0.0;
			
			if (i%2==0) {
				termValue = -4.0/odd;	
			}
			
			else {
				termValue = 4.0/odd;
			}
			
			PI= PI+termValue;
			odd=odd+2;
			
		}
		
		System.out.println("15th term is: " + PI);	
		
	}
}
