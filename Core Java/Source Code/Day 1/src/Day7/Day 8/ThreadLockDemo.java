package Day7;

public class ThreadLockDemo {
	public static Object lock1=new Object();
	public static Object lock2=new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemo1 t1=new ThreadDemo1();
		ThreadDemo2 t2=new ThreadDemo2(); 
		t1.start();
		t2.start();
	}
}

class ThreadDemo1 extends Thread
{
	public void run() {
		synchronized(ThreadLockDemo.lock1) {
			System.out.println("Thread1 Holding Lock1");
			try {
				Thread.sleep(8000);
				ThreadDemo2 t2=new ThreadDemo2(); 
				t2.start();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			synchronized(ThreadLockDemo.lock2)
			{
				System.out.println("Thread1 Holding Lock1 & Lock2");
			}
		}
	}
	
}
	

class ThreadDemo2 extends Thread{
	public void run() {
		synchronized(ThreadLockDemo.lock1) {
			System.out.println("Thread2 Holding Lock1");
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			synchronized(ThreadLockDemo.lock2)
			{
				System.out.println("Thread2 Holding Lock1 & Lock2");
			}
		}
	}
}