
interface Addition
{
	public void sum(int a, int b);
}
interface Subtraction
{
	public void sub(int a,int b);
}
class Calculator implements Addition,Subtraction
{
	public void sum(int a ,int b)
	{
		System.out.println((a+b));
	}
	public void sub(int a, int b)
	{
		System.out.println((a-b));
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator b=new Calculator();
		b.sum(25, 50);
		b.sub(100, 50);
	}

}
