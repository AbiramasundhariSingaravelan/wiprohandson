import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object of Scanner
		// new will allocate memory space for the object
		int marks;
		System.out.println("Enter your Marks: ");
		System.out.println("Enter your Marks: ");
		
		Scanner s=new Scanner(System.in);
		marks=s.nextInt();//converting string into integer
		if(marks >=90)
		{
			System.out.println("A Grade");
		}
		else if(marks > 80)
		{
			if(marks<90)
			{
			System.out.println("B Grade");
			}
		}
		else if((marks > 70)||(marks <80))
		{
			System.out.println("C Grade");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
