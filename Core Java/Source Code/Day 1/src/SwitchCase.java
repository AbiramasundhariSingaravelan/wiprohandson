import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option,a,b,c;
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		Scanner s=new Scanner(System.in);//creating an object 
		System.out.println("Enter value for A: ");
		a=s.nextInt();
		System.out.println("Enter value for B: ");
		b=s.nextInt();
		System.out.println("Enter your choice");
		
		option=s.nextInt();//reading value and storing in opt variable
		switch(option)//switch(2)
		{
			case 1:
				c=a+b;
				System.out.println("Result of Addition"+c);
				break;
			case 2:
				c=a-b;
				System.out.println("Result of Subtraction: "+c);
				break;
			case 3:
				c=a*b;
				System.out.println("Result of Multiplication: "+c);
				break;
			case 4:
				c=a/b;
				System.out.println("Result of Division: "+c);
				break;
			default:
				System.out.println("Invalid");
		}
	}

}
