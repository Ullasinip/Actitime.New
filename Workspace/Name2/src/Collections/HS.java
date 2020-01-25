package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HS {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(11);
		hs.add(11);
		hs.add('a');
		hs.add("Hello");
		System.out.println(hs);
		
		//to print line by line.  
		
		Iterator itr=hs.iterator(); //iterator() is the Helper mether which returns the Object of Iterator interface implementation class. In this case it is object of HashSet implementation class.
		while(itr.hasNext()) // while there is a next ele present in the hashset
		{
			System.out.println(itr.next()); // next() moves to next element and returns the element
		}
		
		
	}

}
