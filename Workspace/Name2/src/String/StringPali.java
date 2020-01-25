package String;

public class StringPali {

	public static void main(String[] args) {
		
		String str1="ISI";
		System.out.println("The given string is:"+str1);
		System.out.println("The length of the given string is:"+str1.length());
		String str2="";
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			
			if(str1.charAt(i)=='i')
			{
				System.out.println(str1.charAt(i));
				count++;
			}
		}
		System.out.println("The number of times the given character appear in the string are:"+count);
		for(int i=str1.length()-1;i>= 0;i--)
		{
			str2+=str1.charAt(i);
		}
		System.out.println("Reversed string is:"+str2);
		if(str1.equals(str2))
		{
			System.out.println("Given string is a palindrome");
		}
		else
			System.out.println("Given string is not a palindrome");
	}

}
