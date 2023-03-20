package Day7;

class ThreadEg extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread Class");
	}
}
class ThreadEx implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Thread2 Class");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEg t=new ThreadEg();//new state
		t.start();//acti
		ThreadEx ex=new ThreadEx();
		Thread t1=new Thread(ex);
		t1.start();
	}

}
