package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LL {

	public static void main(String[] args) 
	{
			LinkedList al=new LinkedList(); //size will be 10
			System.out.println("LL Size:"+al.size());
			al.add(12);
			al.add(41);
			al.add(9);
			al.add(0);
			al.add(80);
			for(int i=0;i<al.size();i++)  
	        	System.out.println(al.get(i));  
			for(int i=0;i<al.size();i++)
			{
				for(int j=0;j<al.size();j++)
				{
					Integer itr1=(Integer)al.get(i);
					Integer itr2=(Integer)al.get(j);
					if(itr1<itr2)
					{
						int temp=itr1;
						al.set(i,itr2);
						al.set(j,temp);
					}
				}
			}
			System.out.println("The sorted Linked list is:");
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
			
			System.out.println("The sorted Linked list in descendending order is:");
			Collections.sort(al,Collections.reverseOrder());
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}   
			
	}
}
	 
