package threadpackage;
//creating multiple thread is costly, Thread pools allow thread reuse
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing task...");
	}
}

public class ThreadPoolingEx {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		//If the number of tasks is unknown, use 
		//ExecutorService executor = Executors.newCachedThreadPool();
		//creates new threads as needed and reuses idle threads
		//best for tasks with variable execution times.
		for(int i = 0; i < 5; i++) {
			executor.execute(new Task()); //assign tasks to available threads
			//if more than 3 tasks exist, extra tasks wait until a thread is available
		}
		executor.shutdown(); //stop executing new tasks
		//It waits for all running tasks to complete before shutting down 
	}
}
