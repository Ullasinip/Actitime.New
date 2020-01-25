package ObjectMethods;

public class SL
{
	private static SL s;
	static
	{
		s=new SL();
	}
	private SL()
	{
		
	}
	public static SL getObject()
	{
		return s;
	}
 
}
 	