package Day7;

class Chat
{
	boolean flag=false;
	public synchronized void question(String msg)
	{
		if(flag) {
			try {
				wait();//
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag=true;
		notify();
	}
	public synchronized void answer(String msg)
	{
		if(!flag) {
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag=false;
		notify();
	}
}
class Threadd1 implements Runnable{
	Chat c;
	String[] s1= {"Hi", "How r u? ","doing Good!"};
	public Threadd1(Chat c) {
		this.c=c;
		//Thread t1=new Thread();
		//t1.start();
		new Thread(this,"Question").start();
	}
	public void run()
	{
		for(int i=0;i<s1.length;i++) {
			c.question(s1[i]);
		}
	}
	
}
class Threadd2 implements Runnable{
	Chat c;
	String[] s2= {"Hi", "I'm good ","Great"};
	public Threadd2(Chat c) {
		this.c=c;
		//Thread t1=new Thread();
		//t1.start();
		new Thread(this,"Answer").start();
	}
	public void run()
	{
		for(int i=0;i<s2.length;i++) {
			c.question(s2[i]);
		}
	}
	
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat c=new Chat();
		new Threadd1(c);
		new Threadd2(c);
	}

}
