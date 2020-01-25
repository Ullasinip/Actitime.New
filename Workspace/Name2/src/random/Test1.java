package random;

class A 
{
	A()
	{
		System.out.println("From Constr A");
	}
}
class B extends A
{
	int a;
	B(int a)
	{
		this.a=a;
		System.out.println("From Constr B");
	}
}
class C extends B
{
	C()
	{
		super(30);
		System.out.println("From Constr C");
	}
}
public class Test1
{
	public static void main(String[] args)
	{
	C ref1=new C();
	}
}