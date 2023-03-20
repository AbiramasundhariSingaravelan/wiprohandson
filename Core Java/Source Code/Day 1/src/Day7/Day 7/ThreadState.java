package Day7;

class Demo implements Runnable
{
	public void run()
	{
		try {
			//Thread will be moved on to timed waiting state
		Thread.sleep(5000);//thread will be moved on to sleeping mode for 5s
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//moving thread into timed waiting
		System.out.println("State of Thread 1: " +ThreadState.t1.getState());
	}
}
public class ThreadState implements Runnable {

	public static Thread t1;
	public static ThreadState obj;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj=new ThreadState();
		t1=new Thread(obj);
		//new state
		System.out.println("The state of first thread is "+t1.getState());
		t1.start();
		//Runnable State
		System.out.println("State of thread t1 after invoking start(): "+t1.getState());
	}
	public void run()
	{
		Demo d=new Demo();
		Thread t2=new Thread(d);
		System.out.println("T2 State: "+t2.getState());
		try {
			t2.start();
			//t1 to sleep for 2s;
			Thread.sleep(8000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			//waiting for thread t2 to complete its execution
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Thread State after execution: "+t2.getState());

	}
}
