package Exception;

import java.util.Scanner;

public class Class1 
{
	public static void main(String[] args)
	{
		int num=read();
		int s=square(num);
		display(num, s);
	}

	private static int square(int num) 
	{
		return num*num;
	}

	private static void display(int num,int s)
	{
	System.out.println("The square of"+num+"is:"+s);	
	}

	private static int read()
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}

}
