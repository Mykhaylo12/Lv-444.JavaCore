//1
//Run three threads and output there different messages for 5 times. 
//The third thread supposed to start after finishing working of the two previous threads.
//3
//Create a thread «one», which would start the thread «two», 
//which has to output its number («Thread number two») 3 times and create thread «three», 
//which would to output message «Thread number three» 5 times.

public class Appl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    // First Task 
		Thread t1 = new MyThread(1, 100);
	      Thread t2 = new MyThread(2, 250);
	      Thread t3 = new MyThread(3,0);
	      try {
		      t1.start();
		      t2.start();
		      t1.join();
		      t2.join();			
		} catch (Exception e) {
			// TODO: handle exception
		}

	      t3.start();
	      System.out.println("Thread main");

	      // Second Task
	      Thread t4 = new MyThread2("One","Two", 2, 200, 3);
	      t4.start();
	}

}
