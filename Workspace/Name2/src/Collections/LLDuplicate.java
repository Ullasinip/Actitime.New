package Collections;

import java.util.Comparator;
import java.util.LinkedList;

public class LLDuplicate implements Comparator {

	public static void main(String[] args)
	{
		LinkedList ref=new LinkedList();
		ref.add(10);
		ref.add(20);
		ref.add(30);
		ref.add(40);
		ref.add(10);
		for(int i=0;i<ref.size();i++)
		{
			System.out.println("The elements of the Linked List are:"+ref.get(i));
			
		}
		Comparator c = null;
		ref.sort(c);
		for(int i=0;i<ref.size();i++)
		{
			System.out.println("The elements of the sorted Linked List are:"+ref.get(i));
		}
		for(int i=0;i<ref.size();i++)
		{
			if(ref.get(i).equals(ref.get(i+1)))
			{
				ref.remove(i);
			}
			System.out.println("The elements of the sorted Linked List after removing the duplicates are:"+ref.get(i));
		}

	}

}
