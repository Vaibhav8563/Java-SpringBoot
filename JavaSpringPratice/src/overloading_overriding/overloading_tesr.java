package overloading_overriding;

public class overloading_tesr {
	
	
	void display(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of A and B: "+sum);
	}

	void display(double a, double b) {
		double mult = a*b;
		System.out.println("Multiplication of A and B: "+mult);
	}
	
	void display(String sc) {
		String sc1= "Hello";
		System.out.println("String is: "+sc1+" "+sc);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloading_tesr obj = new overloading_tesr();
		
		obj.display(2.1, 2.1);
		obj.display(3, 2);
		obj.display(1.1, 10);
		obj.display("ABC");

	}

}
