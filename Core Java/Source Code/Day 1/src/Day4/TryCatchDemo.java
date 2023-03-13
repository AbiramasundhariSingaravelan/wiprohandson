package Day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b,c;
		//String str=null;
		///System.out.println(str.length());
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		try 
		{
			System.out.println("Enter b number");
			b=s.nextInt();
			c=a/b;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter a valid digit");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		///System.out.println(c);
	}

}
