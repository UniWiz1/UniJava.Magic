package LAB_TASKS;

import java.util.*;
import java.io.*;

public class LAB7_T3 {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("Exercise.txt");
		if (file.exists()) {
			System.out.println("Change name please");
			System.exit(0);
		}

		try (
			PrintWriter output = new PrintWriter(file);
		) {
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 500) + 1));
				output.print(" ");
			}
		}

		ArrayList<Integer> list = new ArrayList<>();

		try(
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}

		Collections.sort(list);

		System.out.print(list.toString());
		System.out.println();
	}
}
