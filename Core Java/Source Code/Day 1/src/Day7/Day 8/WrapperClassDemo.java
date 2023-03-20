package Day7;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		Integer i=Integer.valueOf(a);//
		Integer j=a;//autoboxing
		//converting primitive to wrapper
		System.out.println(a+" " +i+" "+j);
		System.out.println("Unboxing");
		Integer inta=new Integer(5);
		int i1=inta.intValue();
		int j1=inta;//unboxing
	}//converting wrapper into primitive

}
