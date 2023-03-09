
class Arithmetic
{
	public Arithmetic()
	{
		System.out.println("Default Contructor");
	}
	public Arithmetic(float a,int d)
	{
		System.out.println("Default Contructor"+a);
	}
	public void addNumbers()
	{
		System.out.println("Program for Addition");
	}
	public void addNumbers(int a,int b)
	{
		System.out.println("Result of First Addition: "+(a+b));
	}
	public void addNumbers(int a,float b)
	{
		System.out.println("Result of Second Addition: "+(a+b));
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic arith=new Arithmetic();//
		Arithmetic arith1=new Arithmetic(9.86f,3);
		arith.addNumbers();
		arith.addNumbers(100, 100);
		arith.addNumbers(100,104.56f);
	}

}
