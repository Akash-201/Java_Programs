package Sorting;

public class MergeSort
{
	public static void mergeSort(int[] arr, int start, int end)
	{
		if(start>=end)
			return;

		int mid= (start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr, mid+1, end);
		merge(arr,start,mid,end);
	}

	public static void merge(int[] arr, int start, int mid, int end)
	{
		int n1=mid-start+1;
		int n2=end-mid;

		int[] left=new int[n1];
		int[] right=new int[n2];

		int i, j, k;

		// these two for loop for storing arr with two different sorted array
		for(i=0;i<n1;i++)
		{
			left[i]=arr[start+i]; 
		}
		for(j=0;j<n2;j++)
		{
			right[j]=arr[mid+1+j]; 
		}

		i=0;
		j=0;
		k=start;

		while(i< n1 && j<n2)
		{
			if(left[i]<= right[j])
			{
				arr[k++]=left[i++];
			}
			else
			{
				arr[k++]=right[j++];
			}
		}

		while(i<n1)
		{
			arr[k++]=left[i++];
		}

		while(j<n2)
		{
			arr[k++]=right[j++];
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {5,3,4,1,2,96,56,67};

		System.out.println("Array before sorting");
		for(int val : arr)
		{
			System.out.print(val+" ");
		}

		System.out.println("\nArray after sorting");
		mergeSort(arr,0,arr.length-1);

		for(int val : arr)
		{
			System.out.print(val+" ");
		}
	}

}
