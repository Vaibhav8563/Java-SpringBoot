package practicewithOpalina;

import java.util.Scanner;

public class Test23 {
	

	void calc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();

		do {
			System.out.print("Enter first Number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter second Number: ");
			int num2 = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println(num1 + num2);
				calc();
				break;

			case 2:
				System.out.println(num1 - num2);
				calc();
				break;

			case 3:
				System.out.println(num1 * num2);
				calc();
				break;

			case 4:
				System.out.println(num1 / num2);
				calc();
				break;

			case 5:
				System.out.println(num1 % num2);
				calc();
				break;

			case 6:
				System.out.println("Thanks for using calculator");
				break;

			default:
				System.out.println("Thankss");

			}

		} while (ch != 6);

	}

	public static void main(String[] args) {

		System.out.println("Enter 1 for Addition: ");
		System.out.println("Enter 2 for Substraction: ");
		System.out.println("Enter 3 for Multiplication: ");
		System.out.println("Enter 4 for Division: ");
		System.out.println("Enter 5 for Remainder: ");
		System.out.println("Enter 6 for Exit. ");
		
		Test23 obj = new Test23();
		obj.calc();

	}

}
