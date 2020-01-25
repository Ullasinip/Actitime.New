
public class Covariant
{
	public Object display()
	{
		return new Object();
	}
}
class CovariantSub extends Covariant
{
	public String display()
	{
		return "Overiding with Covariant is possible";
	}
	public static void main(String[] args) {
		Covariant ref=new CovariantSub();
		CovariantSub ref2=(CovariantSub)ref;
		ref.display();
		ref2.display();
	}
}
