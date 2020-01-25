package Immutability;

public class OwnImmutableMain {

	public static void main(String[] args) 
	{
		OwnImmutable name = new OwnImmutable(10.201f);
		
		OwnImmutable ref1 = name.modify(10.201f);
		OwnImmutable ref2 = name.modify(10.21f);
		System.out.println(name.equals(ref1));
		System.out.println(name.equals(ref2));

	}

}
