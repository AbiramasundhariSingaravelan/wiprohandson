
class Demo
{
	private int stid;
	private String name;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.setStid(104);
		d.setName("Arthi");
		d.getStid();//104
		d.getName();//arthi
		int id=d.getStid();
		System.out.println(id);
		System.out.println(d.getName());

	}

}
