package String;

public class Str {
public static void main(String[] args) {
	String s="ABC";
	String s1="Hello";
	String s2="Hello";
	
	System.out.println(s.toString());
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println();
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println();
	System.out.println(s1.equals(s));
	System.out.println(s1.equals(s2));
	
	String str1="Hello How are you?";
	System.out.println(str1.substring(5,11));
	
		
	}
	
}
}
