package CompanyQuestions;

// custom exception or user define exception


class UnderAgeException extends Exception
{
	UnderAgeException() 
	{
		// its call parent class constructor  means its provide description of default exception handler
		super("You are under Age");
	}
	UnderAgeException(String message)
	{
		super(message);
	}
}

public class CustomException
{
	public static void main(String[] args)
	{
		int age=14;
		try
		{
			if(age<18)
			{
				throw new UnderAgeException();
			}
			else
			{
				System.out.println("You are eligible for voting");
			}
		}
		catch(UnderAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
