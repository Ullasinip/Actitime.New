package Collections;

import java.util.TreeSet;

public class TSDesc {

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet<>(new DescTreeSet());
		
		t.add(2121);
		t.add(1321);
		t.add(11342);
		t.add(131);
		t.add(23411);
		t.add(11234);
		t.add(1231);
		t.add(1123);
		// t.add(14.00); CTE TreeSet has to be homogenous
		System.out.println(t);

	}

}
