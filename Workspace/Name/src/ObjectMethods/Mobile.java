package ObjectMethods;

public class Mobile
{
	String name;
	int ram;
	float price;
	int rom;
	double mp;
	private int count=100;
	int size;
	public Mobile(String name, int ram, float price, int rom, double mp,int size)
	{
		this.name = name;
		this.ram = ram;
		this.price = price;
		this.rom = rom;
		this.mp = mp;
		this.size=size;
	}
	public String toString()
	{
		return "Mobile Name:"+name+"RAM:"+ram+"Price:"+price+"ROM"+rom+"MegaPixel:"+mp+"Count"+count;
	}
	public int hashCode()
	{
		return count--;
	}
	public boolean equals(Object obj)
	{
		Mobile mob = (Mobile)obj;
		return this.price<mob.price;
	}
	
}
