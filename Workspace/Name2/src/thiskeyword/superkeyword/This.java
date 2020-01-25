package thiskeyword.superkeyword;

public class This {

	int length;
	int breadth;
	This()
	{
		this.length=90;
		this.breadth=5;
	}
	public void volume()
	{
		int vol=length*breadth;
		System.out.println("Area of Rectangle with length:"+length+" and breadth:"+breadth+" is:"+vol);
	}
	public static void main(String[] args) 
	{
		This ref1=new This();
		ref1.volume(); 

	}

}
