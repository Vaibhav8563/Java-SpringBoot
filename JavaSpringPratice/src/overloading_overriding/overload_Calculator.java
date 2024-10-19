package overloading_overriding;

public class overload_Calculator {
	
	void add(int a, int b) {
		System.out.println("Sum of two integers A & B: "+(a+b));
	}
	
	void add(int a,int b,int c) {
		System.out.println("Sum of three integers A, B & C: "+(a+b+c));

		
	}

	void add(double a,double b) {
		System.out.println("Sum of two double A & B: "+(a+b));

	}
	
	void add(double a,double b,double c) {
		System.out.println("Sum of three double A, B & C: "+(a+b+c));
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overload_Calculator obj = new overload_Calculator();
		obj.add(2, 5);
		obj.add(2, 5, 5);
		obj.add(2.0, 5.5);
		obj.add(20.1, 5, 4.9);
		obj.add(2, 5.0);

	}

}
