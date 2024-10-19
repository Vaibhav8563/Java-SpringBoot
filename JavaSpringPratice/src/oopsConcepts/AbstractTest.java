package oopsConcepts;


abstract class Animal{
	abstract void walk();
	
	abstract void walk2();
	
}


class Test extends Animal{
	void walk(){
		System.out.println("I am walking");
	}
	
	void walk2() {
		System.out.println("I am running");
	}
}








public class AbstractTest {

	public static void main(String[] args) {

		Test obj = new Test();
		obj.walk();
		obj.walk2();
		
		
	}

}
