package Singleton;

public class Singleton 
{
	static private Singleton ref=null;
 /*private Singleton()
 {
	 
 }*/
 static Singleton getObject()
 {
	 if(ref==null)
	 {
		 ref=new Singleton();
	 	return ref;
	 }
	 else
		 return ref;
 }
}
