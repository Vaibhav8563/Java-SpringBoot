package Patterns;
import java.util.Scanner;

public class Squarepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=sc.nextInt();
		System.out.println();
		
		/* for n=5
		  
		    11111
			22222
			33333
			44444
			55555
		 
		 */
		
		
		
//		using for loop
		/*
		 * for(int i=1; i<=n; i++) { 
		 *  for(int j=1;j<=n; j++) {
		 *      System.out.print(i); }
		 * System.out.println(); }
		 */
		
//using while loop
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		/* for this pattern print j instead of i (for n=5)
		 * 
   		    12345
			12345
			12345
			12345
			12345
		   
		 *  */
		
		
		
	}

}
