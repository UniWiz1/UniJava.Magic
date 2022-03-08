package LAB_TASKS;

import java.util.*;

public class LAB7_T2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] array = getArray();

		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("Element's value is: " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("error");
		}
	}

	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}
