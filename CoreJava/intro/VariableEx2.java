package intro;

public class VariableEx2 {

	static int staticCounter; // static g.v

	int instanceCounter; // instance g.v

	public void counter() {
		staticCounter++;

		instanceCounter++;

	}

	public void display() {
		System.out.println("StaticCounter :- " + staticCounter);
		System.out.println("InstanceCounter:-" + instanceCounter);
	}

	public static void main(String[] args) {

		VariableEx2 obj1 = new VariableEx2();

		VariableEx2 obj2 = new VariableEx2();

		VariableEx2 obj3 = new VariableEx2();

		obj1.counter(); //1,1

		obj2.counter(); //2,1

		obj3.counter(); //3,1
		
		obj3.counter();//4,2
		
		obj3.display(); 

	}
}
