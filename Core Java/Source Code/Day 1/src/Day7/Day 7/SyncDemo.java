package Day7;

class Table{
	static synchronized void  printTable(int n)
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+ "*"+n+"="+(n*i));
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread
{
	Table t;
	Thread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class Thread2 extends Thread
{
	Table t;
	Thread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
	}
}
public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Table obj=new Table();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t1.wait();//make the thread T1 to wait until t2 invokes notify
		t1.notify();//making the thread to resume its process
		t2.start();
	}

}
