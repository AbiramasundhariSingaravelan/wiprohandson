package Day4;

public class ThrowKeywordDemo {

	public  static void validate(int age)throws ArithmeticException
	{
		try
		{
			if(age < 0)
			{
				throw  new ArithmeticException("Must be a valid number");
			}
			else
			{
				System.out.println(age);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		//executed irrespective of the exception to occur or not
		finally
		{
			System.out.println("Always Executed");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(-8);
		
	}

}
