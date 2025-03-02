package Arrays;

public class SecondSmallestElement 
{ 
	public static int secondSmallestElement(int[] arr)
	{
		int smallest=arr[0];
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i]!=smallest)
			{
				secondSmallest=arr[i];
			}
		}
		return secondSmallest;
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {45};
		System.out.println("Second Smallest Element Is: "+secondSmallestElement(arr));
	}

}
