package Exception;

import java.util.Scanner;

public class ARE 
{

	public static void main(String[] args)
	{
		int num=read();
		int num1=read();
		int res=square(num);
		int res2=10;
		try
	  	{
			res2=div(num,num1);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		display(num,res);
		display(num,num1,res2);
	}
	private static void display(int num, int num1, int res2)
	{
		System.out.println("Division result of " + num +" and "+ num1+" is: "+ res2 );
		
	}
	private static void display(int num, int res) 
	{
		System.out.println("Square of "+num+" is:"+res);
		
	}
	private static int div(int num, int num1)
	{
		return num/num1;
	}

	private static int square(int num)
	{
		
		return num*num;
	}

	private static int read() 
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}


}
