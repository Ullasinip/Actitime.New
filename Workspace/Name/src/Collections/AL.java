 package Collections;

import java.util.ArrayList;

public class AL 
{

	public static void main(String[] args)
	
	{
		ArrayList al=new ArrayList(); //size will be 10
		
		System.out.println("AL Size:"+al.size());
		System.out.println("AL:"+al);
		
		al.add(11);
		al.add(12);
		al.add(13);
		
		al.add(14.00);
		al.add(16.21);
		al.add('F');
	
		System.out.println("AL Size:"+al.size());
		System.out.println("AL:"+al);
		
		al.add("Hello");
		al.add(null);
	//	al.add(17,'9'); // CTE 17 is the index which is not present at present as AL index is only till the index 10
		//al.add(8,'S'); // CTE since we have added 8 ele till now, index is created only from 0-7
		al.add(7,'a');
		al.add('g');
		al.add(2,'z');
		al.add(11,'v');
		
		System.out.println("AL Size:"+al.size());
		System.out.println("AL:"+al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		// Print only the integer values in the array
		for(int i=0; i<al.size();i++)
		{
			if(al.get(i) instanceof Integer)
			{
				System.out.println("The integer values in the array are:"+al.get(i));
			}
		}
}
}