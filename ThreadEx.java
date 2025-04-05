package threadpackage;

class ThreadEx extends Thread {
	public void run() { //run() method contain the code to execute
		System.out.println("Thread is running....");
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx();
		ThreadEx t2 = new ThreadEx();
		t1.start(); //start() creates a new thread and calls run()
		t2.start();
		//both threads execute concurrently, output order may differ
	}
}
