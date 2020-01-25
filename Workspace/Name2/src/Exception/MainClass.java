package Exception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		Check c=new Check();
		try
		{
			c.checkAge(age);
		}
		catch(VotingException e)
		{
			System.out.println(e.getLocalizedMessage());
		}

	}

}
