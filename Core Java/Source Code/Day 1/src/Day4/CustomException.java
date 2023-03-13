package Day4;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}
class TestCustomException
{
	public void validate(int age)
	{
		try
		{
			if(age < 0)
			{
				throw  new InvalidAgeException("Age cannot be negative");
			}
			else
			{
				System.out.println(age);
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCustomException tt=new TestCustomException();	
		tt.validate(-8);
	}

}
