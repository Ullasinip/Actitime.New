package SortArray;

public class QuickSortAsc
{
	public static void quicksortArr(int[] arr)
	{
		   System.out.println("The original array is:");  
		   int i;
		   int low=0;
		   int high=arr.length-1;
		   for(i=0;i<arr.length;i++)  
			   System.out.println(arr[i]);  
		  quickSort(arr, low, high);  
		   System.out.println("\nThe sorted array in ascending order using QuickSort is:");  
		   for(i=0;i<arr.length;i++)  
			   System.out.println(arr[i]);  
	}
	public static void quickSort(int arr[],int low,int high)
	{
		   int i=low;
		   int j=high;
		   int mid=(low+high)/2;
		   int pivot=arr[mid];
		   while(i<=j)
		   {
			   while(arr[i]<pivot)
			   {
				   i++;
			   }
			   while(arr[j]>pivot)
			   {
				   j--;
			   }
			   if(i<=j)
			   {
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				   i++;
				   j--;
			   }
		   }
		   if(low<j)
		   {
			   quickSort(arr,low,j);
		   }
		   if(high>j)
		   {
			   quickSort(arr,i,high);
		   }
	 }
  }  
	


