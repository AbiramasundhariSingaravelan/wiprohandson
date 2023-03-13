
class AA
{
	void m1()
	{
		System.out.println("Inside Base Class");
	}
	static void getObject()
	{
		
	}
	
}
class B extends AA
{
	void m1()
	{
		System.out.println("Inside Derived Class1");
	}
	
}
class C extends AA
{
	void m1()
	{
		System.out.println("Inside Derived Class 2");
	}
}
public class RTPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();//object of Class A
		//memory is allocated during compile time;
		B b=new B();//object of Class B
		C c=new C();//object of Class C
		a.m1();
	a.m1(100);
		AA ref;//null 
		//System.out.println("printing" +ref);
		ref=a;
		System.out.println("printing" +ref);
		System.out.println("First Reference:");
		ref.m1();//invoke m1 method of Base Class (A Class)
		ref=b;
		System.out.println("printing second ref" +ref);
		System.out.println("Second Reference");
		ref.m1();//invoke m1 method of Derived Class 1 (B Class)
		ref=c;
		System.out.println("printing third ref" +ref);
		System.out.println("Third Reference");
		ref.m1();//invoke m1 method of Derived Class 2 (C Class)
	}

}
