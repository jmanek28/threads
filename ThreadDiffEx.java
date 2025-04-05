package threadpackage;
//implementing runnable - can extend another class
 class ParentClass{
	 void show() {
		 System.out.println("Parent class method");
	 }
 }
 
 class MyRunnable extends ParentClass implements Runnable{
	 //can extend another class
	 public void run() {
		 System.out.println("Thread is runnning...");
	 }
 }
 
public class ThreadDiffEx {
	public static void main(String[] args) {
		MyRunnable myrunnable = new MyRunnable();
		Thread t = new Thread(myrunnable);
		myrunnable.show(); //accessing ParentClass method
		t.start();
	}
}
