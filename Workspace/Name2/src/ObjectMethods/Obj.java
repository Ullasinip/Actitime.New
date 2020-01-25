package ObjectMethods;

public class Obj {

	public static void main(String[] args)
	{
		Object obj=new Object();
		Object obj1=new Object();
		Object obj2=new Object();
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println();
		System.out.println(obj1.equals(obj));
		System.out.println(obj1.equals(obj2));

	}

}
