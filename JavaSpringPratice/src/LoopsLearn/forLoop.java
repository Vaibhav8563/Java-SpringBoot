package LoopsLearn;

public class forLoop {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++ ) {
			System.out.println(2+" * "+ i +" = "+ i*2);	
		}
		
//		Sum of number from 1 to 10
		int sumNatural=0;
		int sumEven=0;
		for(int i=1; i<=10; i++) {
			sumNatural+=i;	//sum of natural numbers from 1 to 10
			sumEven+= 2*i;  //sum of  10 even numbers from 1

		}
		int sumOdd=0;
		for(int i=1; i<=10; i+=2) {
			sumOdd+=i;	//sum of  10 odd numbers from 1

		}

		System.out.println();
		System.out.println("Sum of numbers from 1 to 10=  "+sumNatural);
		System.out.println();
		System.out.println("Sum of  10 even numbers from 1=  "+sumEven);
		System.out.println();
		System.out.println("Sum of  10 odd numbers from 1=  "+sumOdd);
	
	}

}
