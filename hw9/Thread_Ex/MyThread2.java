
public class MyThread2 extends Thread {
	private int number;
	private int pause;
	private String name;
	private String nameThread;
	private int count;
	

	public MyThread2(String name, String nameThread, int number, int pause, int count) {
		this.number = number;
		this.pause = pause;
		this.name =name;
		this.count=count;
		this.nameThread=nameThread;
		
	}

	public void run() {
		Thread t1 = new MyThread3("Two","Three",3,200,5);
		t1.start();		
		for (int i = 0; i < count; i++) {
			try {
				sleep(pause);
			} catch (InterruptedException e) {
			}
			System.out.println(" Thread " + nameThread+ " number "+number);
		}
	}
}
