package Arrays;

// second largest element in an array (if all elements are differents)

public class Second_Largest_Element 
{
	public static void print(int[] arr)
	{
		System.out.println("Original Array");
		for(int ele : arr)
		{
			System.out.print(ele+" ");
		}
		
		// sort an array
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=arr[i];
				if(arr[i]>arr[j])
				{
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\nSecond largest element are:- "+arr[arr.length-2]);
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,10,4,9,1,5,11,3,8,7};
		print(arr);
		
	}
	

}
