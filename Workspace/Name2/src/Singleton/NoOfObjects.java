
package Singleton;

public class NoOfObjects {
	static int count=0;
	
	private static NoOfObjects ref1 = null;
	private NoOfObjects() 
	{
		
		System.out.println("From Constr");
	}
	public static NoOfObjects getObject()
	{
		
		if(ref1==null)
		{
			ref1=new NoOfObjects();
			count++;
			return ref1;
		}
		else
			return ref1;
	}

}
