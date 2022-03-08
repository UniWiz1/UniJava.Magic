package LAB_TASKS;

import java.util.Arrays;
import java.util.Scanner;

public class LAB4_T1 {
	
	public static int l;

	public static void main(String[] args) {
		l = 1;
		int n = 0;
		int list[] = new int[10];
    	Scanner input = new Scanner (System.in);
    	System.out.print("enter ten numbers ");

        for (int i = 0; i<10; i++) {
        	
        	int j = input.nextInt();
        	list[i]=j;
        	
        }

        Arrays.sort(list);
        
        int llist[]=eliminateDuplicates(list);
   
        System.out.print("The distinct numbers are ");
        
        for (int t = 0; t<l; t++) {
        	
        	System.out.print(llist[t]+ " ");
        	
        }
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		
		int n = 0;

		for (int k = 1; k < 10; k++) {
        	if (list [k] != list [k-1]) {
        		
        		l++;
        		
        	}
        	else {}
        	
        }
        
        int llist[] = new int [l];
        
        for (int m = 0; m<10;m++) {
        	
        	if (m < 9 && list[m] != list[m+1]) {
        		
        		llist[n] = list[m];
        		n++;
        	}
        	
        	else if (m == 9 && list[m] != list[m-1]) {
        		
        		llist[n] = list[m];
        		
        	}
        	
        	else if (list[8] == list[9]) {
        		
        		llist[l-1] = list[9];
        		
        	}
        }
		
		return llist;
		
	}
		
}