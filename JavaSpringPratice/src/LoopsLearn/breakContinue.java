package LoopsLearn;

public class breakContinue {
	public static void main(String[] args) {
		int i=1;
		
		
//		break statement use to go out from loop 
			for(i=1; i<=10; i++) {
				System.out.println("Toffee given to: "+i);
				if(i==5) {
					break;
				}
			}
			
			
			//Output
			 /*	
			    Toffee given to: 1
				Toffee given to: 2
				Toffee given to: 3
				Toffee given to: 4
				Toffee given to: 5
	        */
			
			

			System.out.println();//add a new line
			System.out.println();//add a new line
			
//	Continue keyword skip that condition which given 
			for(int j=1; j<=10; j++) {
					if(j==5 || j==7) {
						continue;
					}
				System.out.println("Toffee given to: "+j);
				
			}

			//Output
			  /* 
		 		Toffee given to: 1
				Toffee given to: 2
				Toffee given to: 3
				Toffee given to: 4
				Toffee given to: 6
				Toffee given to: 8
				Toffee given to: 9
				Toffee given to: 10
	
			 */
	
	}

}
