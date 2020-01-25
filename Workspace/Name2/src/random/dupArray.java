package random;
import java.util.Scanner;
public class dupArray {

	Scanner sc;
	public static void main(String[] args) 
	{
		dupArray ref1=new dupArray();
		
		ref1.sc=new Scanner(System.in);
	
		int size=ref1.readSize();
		
		int a[] = new int[size];
		a=ref1.readArrEle(a);
		
		a=ref1.dupArrayEle(a);
		
		ref1.dispArr(a);

	}

	public int readSize() 
	{
		System.out.println("Enter the size of the array");
		return sc.nextInt();
	}
	
	int[] readArrEle(int[] a)
	{
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}

	int[] dupArrayEle(int[] a) 
	{
		
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					int same=j;
					for(int k=j+1;k<size;k++)
					{
						a[same]=a[k];
						same++;
					}
					size--;
					j--;
				}
				
			}
		}
		return a;
	}
	void dispArr(int a[])
	{
		System.out.println("The array after removing the duplicate elements are:");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}

}
