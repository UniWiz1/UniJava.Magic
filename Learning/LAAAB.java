		import java.util.Scanner;

		public class LAAAB {
			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				double[] arr = new double[10]; 

				System.out.print("Enter numbers: ");
				
				for (int i = 0; i < arr.length; i++)
					arr[i] = input.nextDouble();

				System.out.println(" index of largest number is " +
					indexOfLargestElement(arr));
			}

			public static int indexOfLargestElement(double[] array) {
				if (array.length <= 1)
					return 0;
				
				double number = array[0];
				int indexOfLargest = 0;
				
				for (int i = 1; i < array.length; i++) {
					if (array[i] > number) {
						
						number = array[i];
						indexOfLargest = i;
						
					}
				}
				
				return indexOfLargest;
			}
		
	}


