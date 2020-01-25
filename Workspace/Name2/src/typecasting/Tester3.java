package typecasting;

public class Tester3 
{
	int a;
	Tester3(double d)
	{
		 this.a=(int)d;
	}
	public static void main(String[] args)
	{
		Tester3 ref=new Tester3(6.0);
		System.out.println(ref.a);
	}
}
