package Array;

public class First_And_Second_SmallestElement 
{
	public static void findFirstAndSecondSmallestElement(int[] arr)
	{
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
		System.out.println("First smallest element: "+arr[0]);
		System.out.println("Second smallest element: "+arr[1]);
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {66,35,267,74,2,86};
		findFirstAndSecondSmallestElement(arr);
		
	}

}
