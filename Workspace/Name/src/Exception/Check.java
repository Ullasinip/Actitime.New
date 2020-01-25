package Exception;

public class Check 
{
	public void checkAge(int age)
	{
		if(age>=18)
			System.out.println("All good....Go ahead and Vote");
		else
			throw new VotingException(18-age+" these many years early");
	}
}
