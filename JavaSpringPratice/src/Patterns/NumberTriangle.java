package Patterns;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* for n=5                  for this print j instead of i    
		    1							1
			22							12
			333							123
			4444						1234
			55555						12345
		    
		*/
		
		
		for(int i=1; i<=5; i++) { 
			   for(int j=1;j<=i; j++) 
			   {
			       System.out.print(i); 
			       }
			  System.out.println(); }
		

	}

}
