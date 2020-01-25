package Singleton;

public class SingletonSubClass {

	public static void main(String[] args) 
	{
		Singleton ref2=new Singleton();
		Singleton ref3=new Singleton();
		System.out.println(Singleton.getObject());

	}

}
