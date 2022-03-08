import java.util.Arrays;
import java.util.Scanner;

public class main {
	
public static double index[] = new double[2];
public static int a = 0;


	public static void main(String[] args) {
		
		double sum = 0;
		
Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of cities: ");
		int x = input.nextInt();
		int y = x;
		
		double sums[] = new double[x];
		double sums2[] = new double[x];
		double[][] coords = new double[x][2]; 
		
		System.out.println("Enter the coordinates of the cities: ");
		
		for( int i=0; i<x; i++) {
			for( int j=0; j<2; j++) {
				coords[i][j] = input.nextDouble();
			}
		}

		double[][] distances = new double[x][y]; 
					
		for( int i=0; i<x; i++) {
			for( int j=0; j<x; j++) {
				
				distances[i][j] = Math.pow(Math.pow(coords[i][0]-coords[j][0], 2) + Math.pow(coords[i][1]-coords[j][1], 2) , 0.5);
				
				}
			
			}
		
		for (int i = 0; i < x; i++) {
			for (int j= 0; j < y; j++) {
			
			sum = sum + distances [i][j];	
				
			}
			
			sums[i]=sum;
			sums2[i]=sum;
			sum = 0;
			
			}
		
		Arrays.sort(sums2);
		
		for (int i = 0; i <5; i++) {
			if (sums[i]==sums2[0]) {
				index[0] = coords[i][0];
				index[1] = coords[i][1];
			}
		}
		
		sums2[0] = 100 * sums2[0];
		sums2[0] =(int) sums2[0];
		sums2[0] = sums2[0]/100;

		System.out.println("The central city is at ("+index[0] +","+ index[1]+")");
		System.out.println("The total distance to all other cities is "+sums2[0]);
	
		}
	
	}
