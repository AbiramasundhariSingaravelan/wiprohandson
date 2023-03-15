import java.util.Scanner;

public class ArrayEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring an array with initialization
		int a[]= new int[5];//last index of array
	//0 1 2 3 4
		System.out.println("Enter five elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			a[i]=s.nextInt();
		}
		
	}
}
