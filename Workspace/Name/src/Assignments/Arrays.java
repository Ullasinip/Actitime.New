package Assignments;

import java.util.Scanner;
import AddDelRemArray.*;
import SortArray.*;

public class Arrays 
{
	private int array[]; 
    private int count; 
    private int size; 
    
    public Arrays() 
    { 
        array = new int[1]; 
        count = 0; 
        size = 1; 
    } 
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array:\n");
	int [] arr = new int[sc.nextInt()];
	System.out.println("Enter elements of the array:\n");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter your selection.\n 1. Add Elements to the array.\n 2. Delete elements from the array.\n 3. Sort array into ascending order using Quick Sort. \n 4. Sort array into descending order using Merge sort.\n 5. Remove duplicates. \n");
	int select=sc.nextInt();
	switch(select)
	{
	case 1: AddArray.addArrayEle(arr);break;
	case 2: DelArray.delArrayEle(arr);break;
	case 3: QuickSortAsc.quicksortArr(arr);break;
	case 4: MergeSortDesc.mergesortArr(arr);break;
	case 5: RemoveDupArr.delDupArrEle(arr);break;
	default: System.out.println("Invalid choice");
	}
	}
}
  	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     9999 