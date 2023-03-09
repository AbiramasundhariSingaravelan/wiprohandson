
class Vehicle
{
	int wheels;
	
	public void speed()
	{
		System.out.println("Base Cass:");
		System.out.println("Calculated NAN Km/hr");
	}
}
class Car extends Vehicle
{
	public void speed(int km)
	{
		System.out.println("Inside Derived Class:");
		System.out.println("Travelled "+km+" KM/hr");
	}
	public void acclr()
	{
		System.out.println("Accelarator method inside derived class");
	}
}
class Bike extends Vehicle
{
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.wheels=4;
		c.speed();
		c.speed(20);
		c.acclr();
	}

}
