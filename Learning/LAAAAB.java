import java.util.Scanner;
	
public class LAAAAB {
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);	
			int[] numbers = new int[10];	

			
			System.out.print("Enter numbers: ");
			for (int i = 0; i < numbers.length; i++)
				numbers[i] = input.nextInt();

		
			reverseArr(numbers);

			for (int i = 0; i<10;i++) {
				System.out.print(numbers[i] + " ");
			}
			
		}

		public static void reverseArr(int[] list) {
			int llist;
			for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
				llist = list[i];
				list[i] = list[j];
				list[j] = llist;
			}
		}
}
