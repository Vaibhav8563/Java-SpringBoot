package Patterns;

public class starPatterns {

	public static void main(String[] args) {
		
		/* for 5
		 
		    *
			**
			***
			****
			*****		  
		  
		 */
	       System.out.println("Pattern 1: ");
	       System.out.println();
	       

		for(int i=1; i<=5; i++) { 
			   for(int j=1;j<=i; j++) 
			   {
			       System.out.print("* "); 
			       }
			  System.out.println(); 
			  }
		
		 System.out.println(); System.out.println();
		 
		 /* for 5,   reverse pattern
		 
			    *****
				****
				***
				**
				*  
		  
		 */		  
	       System.out.println("Pattern 2: "); 
	       System.out.println();

		for(int i=1; i<=5; i++) { 
			   for(int j=5;j>=i; j--) 
			   {
			       System.out.print("* "); 
			       }
			  System.out.println(); 
			  }
		 
		
		
		System.out.println(); System.out.println();		
		
	//pattern 3 full
		
		/*	
		
				* 
				* * 
				* * * 
				* * * * 
				* * * * * 
				* * * * 
				* * * 
				* * 
				* 		
	   
	    */
	       System.out.println("Pattern 3: "); 
	       System.out.println();

		for(int i=1; i<=5; i++) { 
			   for(int j=1;j<=i; j++) 
			   {
			       System.out.print("* "); 
			       }
			  System.out.println(); 
			  }  
		
		for(int i=1; i<=5; i++) { 
			   for(int j=4;j>=i; j--) 
			   {
			       System.out.print("* "); 
			       }
			  System.out.println(); 
			  }
		 
		
System.out.println(); System.out.println();

		
		System.out.println("Pattern 4: "); 
		System.out.println();
		
		for(int i=1; i<=5; i++) { 
			   for(int j=1;j<=i; j++) 
			   {
			       System.out.print(" "); 
			       }
			   for(int k=1; k<=i; k++) {
				   System.out.print("*");
			   }
			  System.out.println(); 
			  }  
			}

	
	
	
	
	
	
	
	 
		    
		 
	
	
	
	
	
	
	
	
	
	
	
	
}