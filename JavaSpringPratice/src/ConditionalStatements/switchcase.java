package ConditionalStatements;
import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter value of B: ");
		int b=sc.nextInt();
		
		System.out.println();
		System.out.println();
		
		System.out.println("For Addition enter: 1 ");
		System.out.println("For Substraction enter: 2 ");
		System.out.println("For Multiplication enter: 3 ");
		System.out.println("For Division enter: 4 ");
		System.out.println("For Remainder enter: 5 ");
		
		System.out.println("Enter the operator: ");
		int c = sc.nextInt();
		int d=0;
		
		if(d>0 || d<6) {
			
				switch(c){
					
				case 1:
					d=a+b;
					System.out.println("Addition is: "+d);
					break;
					
				case 2 :
					d=a-b;
					System.out.println("Substraction is: "+d);
					break;
				
				case 3 :
					d=a*b;
					System.out.println("Multiplication is: "+d);
					break;
				
				case 4 :
					d=(a/b);
					System.out.println("Division is: "+d);
					break;
				
				case 5 :
					d=a%b;
					System.out.println("Remainder is: "+d);
					break;
				
				default:
					System.out.println("Not a valid input.");
					
					
				}
				
			}		
		else {
			System.out.println("Enter a valid input.");
		
		}
		sc.close();

  }
}
