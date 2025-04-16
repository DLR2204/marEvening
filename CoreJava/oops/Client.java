package oops;

public class Client {
	
	public static void main(String[] args) {
		
		Calculator calculate = new CalChild();
		
		calculate.add(23, 45);
		
		calculate.sub(100, 25);
		
		calculate.mul(12, 12);
		
		calculate.div(1000, 4);
		
		
	}

}
