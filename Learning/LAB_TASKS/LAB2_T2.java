package LAB_TASKS;

class LAB2_T2
{
	public static void main(String[] args) {
	
	int x = 1;
	int y = 1;
	int value = 0;
	
	for(int i = 1; i <= 24; i++) {
		
		if(i > 2) {
			
			value = x + y;
			x = y;
			y = value;
			
		}
		
		else {
			
			y = 1;
		}
		
	}
	
	System.out.println("number of pairs is: " + y);

	}
}
