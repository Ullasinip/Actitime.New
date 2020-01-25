package typecasting;

public class Tester4 
{
	public void display(int a)
	{
		System.out.println("From display(int)");
		System.out.println(a);
	}
	public void display(byte b)
	{
		System.out.println("From display(byte)");
		System.out.println(b);
	}
	public static void main(String[] args) {
		Tester4 ref1=new Tester4();
		ref1.display(5);//All integer values are int by default.
		ref1.display((byte)5);
	}
}
