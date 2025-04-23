package java8;



public class MultiThreading implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {

			System.out.println(i + ".ChildThread");
		}

	}
	
	public static void main(String[] args) {
		
		MultiThreading obj = new MultiThreading();
		
		Thread thread= new Thread(obj);
		
		thread.start();  //run method calling
		
		
		for(int i = 11;i<=20;i++) {
			System.out.println(i+".MainThread");
		}
	}


}
