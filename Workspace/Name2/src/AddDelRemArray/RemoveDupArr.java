package AddDelRemArray;

import java.util.Scanner;

import SortArray.QuickSortAsc;

public class RemoveDupArr
{
	
	public static void delDupArrEle(int[] arr)
	{
		QuickSortAsc.quicksortArr(arr);
		int size=removeDuplicateEle(arr,arr.length);
		System.out.println("The elements of the modified Array after removing the duplicate elements are:");
		for(int i=0;i<size;i++)
		System.out.println(arr[i]+"");
	}
	public static String readSize(Scanner sc)
	{
		return(sc.nextLine());
	}
	public static void readArrEle(Scanner sc,int a[])
	{
		for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();
	} 
	public static int removeDuplicateEle(int [] arr, int n)
	{
		if(n==0 || n==1)
		return n;
		int temp[] = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++)
		arr[i]=temp[i];
		return j;
	}	
		
	
}
