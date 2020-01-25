package encapsulation;

public class GetttersAndSetters 
{
	private int a;
	private double d;
	

	public GetttersAndSetters(int a, double d) 
	{
		this.a = a;
		this.d = d;
	}
	public int getA()
	{
		return a;
	}
	public double getD()
	{
		return d;
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public void setD(double d)
	{
		this.d=d;
	}
	public static void main(String[] args) 
	{
		GetttersAndSetters ref=new GetttersAndSetters7(10,20.0);
		
		
		System.out.println(ref.a);
		System.out.println(ref.d);
		ref.setA(30);
		ref.setD(40.0);
		System.out.println(ref.a);
		System.out.println(ref.d);
		
	}

}
