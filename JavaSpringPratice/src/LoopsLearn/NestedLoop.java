package LoopsLearn;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		/* 
			00000
			11111
			22222
			33333
			44444
		 
		*/
		
		
		System.out.println();
		System.out.println();
		System.out.println();
	
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/* 
			01234
			01234
			01234
			01234
			01234
	    */

		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		  /* 
					//space also printed, if want to remove then add j<=i
			1
			22
			333
			4444
		 */
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
   		/* 
					//space also printed, if want to remove then add j<=i
			0
			01
			012
			0123
		*/
		
		System.out.println();
		System.out.println();
		System.out.println();
				
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
			0
			01
			012
			0123
			01234
		*/

		
	
		
	}

}
