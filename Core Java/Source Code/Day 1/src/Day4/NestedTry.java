package Day4;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				int c=100/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
