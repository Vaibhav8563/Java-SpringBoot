package basicpractice;
import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person: ");
		int age=sc.nextInt();
		System.out.println("Age of person is: "+age);
		
		System.out.println();
		System.out.println("Enter the sentence for person: ");
		String d=sc.next();
		System.out.println("Entered sentence for person: "+d);
		
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 1st number: ");
		int	b =sc.nextInt();
		System.out.println("Addition of number: "+(a+b));
		System.out.println("Substraction of number: "+(a-b));
		System.out.println("Multiplication of number: "+(a*b));
		System.out.println("Divison of number: "+(a/b));
		System.out.println("Modulor or Remainder of number: "+(float)(a%b));
		
		sc.close();
		
		
		


		

	
	
	}

}
