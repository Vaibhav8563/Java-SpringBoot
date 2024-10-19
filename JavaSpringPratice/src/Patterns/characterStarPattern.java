package Patterns;

public class characterStarPattern {

	public static void main(String[] args) {
		
//pattern 1		
		/*
		 	A
			BB
			CCC
			DDDD
			EEEEE
		
		*/
		
		
		for(int i=1; i<=5; i++) { 
			   for(int j=1;j<=i; j++) 
			   {
			       System.out.print((char)('A'+i-1) ); 
			       }
			  System.out.println(); 
			  }
		
		System.out.println(); System.out.println();

//pattern 2		
		/* for this pattern
		  
				A
				AB
				ABC
				ABCD
				ABCDE
		 */


		for(int i=1; i<=5; i++) { 
			   for(int j=1;j<=i; j++) {
			       System.out.print((char)('A'+j-1) ); 
			       }
			  System.out.println(); 
			  }
		
		System.out.println(); System.out.println();

//pattern 3		
		/* for this Reverse pattern
		 
				AAAAA
				BBBB
				CCC
				DD
				E
		*/
		
		for(int i=1; i<=5; i++) { 
			   for(int j=5;j>=i; j--) 
			   {
			       System.out.print((char)('A'+i-1) ); 
			       }
			  System.out.println(); 
			  }
				
		System.out.println(); System.out.println();

		
//Pattern 4		
		/* for this Reverse pattern
		 
				EDCBA
				EDCB
				EDC
				ED
				E
		*/
		
		for(int i=1; i<=5; i++) { 
			   for(int j=5;j>=i; j--) 
			   {
			       System.out.print((char)('A'+j-1) ); 
			       }
			  System.out.println(); 
			  }
		
		System.out.println(); System.out.println();

//pattern 5		
		/* for this  pattern
		 
				A				i=1  start= 65+1-1 = 65('A')   j=1 start=65+1 = 66('B')
				BC				i=2  start= 65+2-1 = 66('B')   j=1 start=66+1 = 67('C')   j=2  start= 67+1 = 68('D')
				CDE 			i=3  start= 65+3-1 = 67('C')   j=1 start=65+1 = 66('D')
				DEFG			i=4  start= 65+4-1 = 68('D')   j=1 start=65+1 = 66('E')
				EFGHI			i=5  start= 65+5-1 = 69('E')   j=1 start=65+1 = 66('F')
		*/
		
		for(int i=1; i<=5; i++) { 
		 char start =(char)('A'+i-1);  
			   for(int j=1;j<=i; j++) 
			   {
				  // char start =(char)('A'+i-1);
			       System.out.print(start);
			       start = (char)(start+1);
			       }
			  System.out.println(); 
			  }
		


	}

}
