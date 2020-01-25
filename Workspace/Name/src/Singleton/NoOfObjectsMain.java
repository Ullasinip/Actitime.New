package Singleton;

public class NoOfObjectsMain 
{
	public static void main(String[] args) 
	{
		NoOfObjects ref=NoOfObjects.getObject();
		NoOfObjects ref1=NoOfObjects.getObject();
		NoOfObjects ref2=NoOfObjects.getObject();
		System.out.println("The number of objects in the Class are:"+NoOfObjects.count);
		System.out.println("ref"+ref);
		System.out.println("ref1"+ref1);
		System.out.println("ref2"+ref2);

	}
}
