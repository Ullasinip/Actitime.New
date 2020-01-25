package typecasting;

public class Print 
{
	void print(Object obj)
	{
		if(obj instanceof A)
		{
			A a1=(A) obj;
			System.out.println(a1.str);
		}
		else if(obj instanceof B)
		{
			B b1=(B) obj;
			System.out.println(b1.str);
		}
		else if(obj instanceof C)
		{
			C c1=(C) obj;
			System.out.println(c1.str);
		}
		
		
	}
}
