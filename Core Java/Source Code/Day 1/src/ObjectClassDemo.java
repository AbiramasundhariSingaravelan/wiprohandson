
class Mobile
{
	public void finalize()
	{
		System.gc();
	}
	public void purchase()
	{
		Integer str=new Integer(4);
		System.out.println("Purchasing method invoked"+str);
		str=null;//integer obj is no longer reachable
		System.gc();
		str=5;
		System.out.println(str);
	}
	public void delivery()
	{
		System.out.println("Delivering method");
	}
}
public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		Mobile m1;
		m1=m;
		System.out.println("ClassName of Object: "+m.getClass());
		System.out.println("HashCode of Object: " +m.hashCode());
		System.out.println("Comparison: "+m.equals(m1));
		System.out.println("String Conversion: "+m.toString());
		//Mobile m2=(Mobile) m.clone();//copy of m
	}

}
