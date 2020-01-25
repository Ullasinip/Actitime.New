
public class methodOveriding 
{
	public int getMessage()
	{
		return 9;
		
	}
}
class MethodSub extends methodOveriding
{
	public void getMessage()
	{
		System.out.println("Overiding with different primitive datatype not possible");
	}
}
