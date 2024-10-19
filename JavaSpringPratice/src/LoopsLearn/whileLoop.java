package LoopsLearn;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		while loop
		
		int i=1;
		while(i<6) {
			System.out.println(i);//print value of i from 1 to 5
			i++;
		}
		
		
		boolean goTo = false;
		while(!goTo) { // go inside while until goTo=True  not given by user
			System.out.println("Goto somewhere");
			System.out.println("Travel");
			goTo=sc.nextBoolean(); //print above statement until you gave "True" as input because goto has False

		}
		
//		do while loop
		int j=1;
		System.out.println();
		do {  
			
			System.out.println(j); //run atleast one time even while condition true or false
			j++;
		}while(j<=5); // go to inside condition until its true for value of j from 1 to 5 (if j=1 assigned)
		System.out.println("Out of Loop");// as condition false then print this
		
		
		
		
		sc.close();
	}

}
