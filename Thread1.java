package threadpackage;

class Thread1 implements Runnable {
	
	public void run() { 
		System.out.println("Thread is running....");
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			System.err.println();
		}
	}

	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx();
		ThreadEx t2 = new ThreadEx();
		//creating thread using Runnable
		t1.start(); 
		t2.start();
	}
}


