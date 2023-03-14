package Day4;

class DemoGen<T,U,A>
{
	//int a;
	//float b;
	//String s;
		T a;
		U b;
		A s;
		DemoGen(T a,U b,A s)
		{
			this.a=a;
			this.b=b;
		}
		public void printdata()
		{
			System.out.println(a);
			System.out.println(b);
		}
}
public class Genericsdemo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoGen<Double,Float> d=new DemoGen<Double,Float>(100.98,123.45f);
		//DemoGen<Float> dd=new DemoGen<Float>(100.98f);
		System.out.println(d.printdata());
	}

}
