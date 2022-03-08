package LAB_TASKS;

import java.util.Arrays;
import java.util.Scanner;

public class LAB4_T2 {
public static int l1;
public static int l2;
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter list1: ");
		l1 = input.nextInt();
		int list[] = new int[l1];

		for (int i = 0; i<l1; i++) {
			
        	int j = input.nextInt();
        	list[i]=j;
        	
        }
		
		System.out.print("Enter list2: ");
		l2 = input.nextInt();
		int list2[] = new int[l2];

		for (int i = 0; i<l2; i++) {
			
        	int j = input.nextInt();
        	list2[i]=j;
        	
        }
		
		int listMain[] = mergeLists(list,list2);
		
		System.out.print("The merged list is ");
	
		for (int t = 0; t<l1+l2; t++) {
        	
        	System.out.print(listMain[t]+ " ");
		}
		
	}
		
		public static int[] mergeLists(int[] list, int[] list2) {
		
			int h = 0;
			
		int listMain[] = new int [l1+l2];
		for (int i = 0; i < l1+l2; i++) {
			if (i < l1) {
			
				listMain[i]=list[i];
				
			}
			
			else {
				listMain[i]=list2[h];
				h++;
			}
								
			}
			
        Arrays.sort(listMain);

        return listMain;

		}
        
		
        }
		
	
