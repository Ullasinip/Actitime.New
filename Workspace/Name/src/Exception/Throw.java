package Exception;

public class Throw
{

	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException("Dont divide by zero");
			//System.out.println("This line will not be executed"); //Throw needs to be the last statement in whichever block it is in
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Done!! ");

	}

}
