package String;
 
public class String1 {

	public static void main(String[] args) 
	{
		String str="I Love India";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
			{
			System.out.println(ch[i]);
			}
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.concat(" too"));
		System.out.println(str.contains("India"));
		System.out.println(str.endsWith("India"));
		System.out.println(str.startsWith("I"));
		System.out.println(str.indexOf('I'));
		System.out.println(str.isEmpty());
		System.out.println(str.lastIndexOf('t'));
		System.out.println(str.replace('I', 'i'));
		System.out.println(str.substring(2, 7));
		System.out.println(str.trim());
		System.out.println(str.compareToIgnoreCase("A"));
		String str2="Z";
		System.out.println(str.compareTo(str2));
	}

}
