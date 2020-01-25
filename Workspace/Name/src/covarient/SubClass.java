package covarient;

public class SubClass extends SuperClass
{
	public SuperClass message()
	{
		return new SuperClass();
	}
	public static void main(String[] args)
	{
		SubClass ref1=new SubClass();
		ref1.message();
	}

}
 