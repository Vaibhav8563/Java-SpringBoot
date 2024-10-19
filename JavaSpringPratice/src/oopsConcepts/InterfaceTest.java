package oopsConcepts;




interface Test1{
	abstract void running();
}

interface Test2 {
	abstract void health();
}

interface Test3 {
	abstract void food();
}



class Demo implements Test1, Test3{
//	public void running() {
//		System.out.println("ruuning Faster");
//	}
//	
	
//	void health() {
//		System.out.println("Health is very good");
//	}
	
	
	public void food() {
		System.out.println("Vegeterian food");
	}

@Override
public void running() {
	// TODO Auto-generated method stub
	
}
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.food();
		d.running();
//		d.health();
		

	}

}
