package overloading_overriding;


class Parent {
	void display() {
		System.out.println("I am Parent class");
	}
	
}



class child extends Parent {
	void display() {
		System.out.println("I am Child class");
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println("Sum is:"+sum);
	}
	
}


public class override_test {

	public static void main(String[] args) {
				
		Parent p = new Parent(); //object of Parent class
		child ch = new child(); //object of Child class
		
		p.display();
		p.display();
		ch.display();
		

	}

}
