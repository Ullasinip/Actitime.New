package typecasting;
class Parent1
{
	public void displayP()
	{
		System.out.println("Normal Smoker");
	}
}
class Child1 extends Parent1
{
	public void displayC()
	{
		System.out.println("Chain Smoker");
	}
}
public class Tester5 
{

	public static void main(String[] args) 
	{
		Parent1 p=new Child1();
		p.displayP();
		//p.displayC();//Subclass features are hidden

	}
}
