
final class VehicleDemo
{
	protected int wheels=2;
	VehicleDemo(){
		System.out.println("Demo constructor");
	}
	public void display()
	{
		System.out.println(wheels);
	}
}
class CarDemo extends VehicleDemo
{
	CarDemo()
	{
		super();//invoking base class constructor
	}
	//wheels=4;
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassName objName=new ClassName()
		CarDemo d=new CarDemo();
		
	}

}
