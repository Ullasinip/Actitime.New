package typecasting;

public class MainClass {

	public static void main(String[] args)
	{
		System.out.println("With generalization");
		Print p=new Print();
		p.print(new A());
		p.print(new B());
		p.print(new C());
		
		System.out.println("Without generalization");
		Display d=new Display();
		d.display(new A());
		d.display(new B());
		d.display(new C());

	}

}
