package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {
	public static void main(String[] args) {
		
	
	ArrayList al=new ArrayList();
	al.add(10);
	System.out.println(al.size());
	al.add(1, 20);
	System.out.println(al.size());
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	//al.clear();
	System.out.println(al.contains(10));
	for(int i=0;i<al.size();i++)
	{
		System.out.println("The array elements after clearing are:"+al.get(i));
	}
	LinkedList ll=new LinkedList();
	ll.addAll(al);
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	System.out.println(ll.containsAll(al));
	Object obj[]=al.toArray();
	for(int i=0;i<obj.length;i++)
	{
		System.out.println(obj[i]);
	}
	al.iterator();
	}
	
}
