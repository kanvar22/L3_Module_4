package threads;
public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	public static void main(String[] args) {
			new Thread(()->newThread(1)).start();
	}
	public static void newThread(int j) {
		if (j>50) {
			
		}
		else {		
		Thread t = new Thread(()->newThread(j + 1));
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello form Thread " + j);
	}
	}
}
