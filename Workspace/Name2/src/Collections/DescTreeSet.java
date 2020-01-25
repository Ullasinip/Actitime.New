package Collections;

import java.util.Comparator;

public class DescTreeSet implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Integer itr1 = (Integer) o1;
		Integer itr2 = (Integer) o2;
		return itr2 - itr1 ;
		itr2
	}
	
}
