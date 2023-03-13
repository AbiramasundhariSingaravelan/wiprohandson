import java.util.Scanner;

public class TDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter the first Matrix");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the second Matrix");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("Resultant Matrix");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
