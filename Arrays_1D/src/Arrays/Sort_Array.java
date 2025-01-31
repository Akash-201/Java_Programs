package Arrays;

// selection sort 
// increasing order

public class Sort_Array
{
	public static void print(int[] arr)
	{
		System.out.println("Original Array");
		for(int ele1 : arr )
		{
			System.out.print(ele1+" ");
		}
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("\nSorted Array");
		for(int ele : arr)
		{
			System.out.print(ele+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,10,4,9,1,5,3,8,7};
		print(arr);
		
	}

}
