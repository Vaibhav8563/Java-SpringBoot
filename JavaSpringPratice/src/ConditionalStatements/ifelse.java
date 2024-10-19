package ConditionalStatements;


import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
//		int a=1; int b=1; int c=10; int d=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a =sc.nextInt();
		System.out.println("Enter value for b: ");
		int b =sc.nextInt();
		System.out.println("Enter value for c: ");
		int c =sc.nextInt();
		System.out.println("Enter value for d: ");
		int d =sc.nextInt();
		
		if(a>b) {
				if(a>c) {
					
					if(a>d) {
						System.out.println("A is largest:"+ a);
					}else {
						System.out.println("D is largest:"+ d);
					}
					
				}else {
					if(c>d) {
						System.out.println("C is largest:"+ c);
					}else {
						System.out.println("D is largest:"+ d);
					}
				}
			
		}else if(b>c) {
				if(b>d) {
					System.out.println("B is largest:"+ b);
				}else {
					System.out.println("D is largest:"+ d);
				}
			}
		
		else if(c>d) {
			System.out.println("C is largest:"+ c);
			}
		else {
			System.out.println("D is largest:" + d);
		}
		
	
	
	}

}
