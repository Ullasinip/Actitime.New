package abstraction;

class Factory
{
	void display(Cake c)
	{
		System.out.println(c.price());
		System.out.println(c.type());
		System.out.println(c.size());
		System.out.println(c.flavour());
		System.out.println(c.custom());
	}
}
