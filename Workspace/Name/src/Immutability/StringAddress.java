package Immutability;

public class StringAddress
{
	public static void main(String[] args) 
		{
			String s = "Hello";
			String s2=s;
			System.out.println(s==s2); //true S and S2 pointing to same object address
			s=s.concat("World");
			System.out.println(s==s2); // false S storing concat of s and pointing to diff address
			String s3=new String();
			s3="Hello";
			System.out.println(s2==s3); //compares addresses of s2 and s3 
			System.out.println(s2.compareTo(s3)); // compares hashcode of strings and returns +ve or -ve int values based on the contents of the string

		}

	}


