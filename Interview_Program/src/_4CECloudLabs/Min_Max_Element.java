package _4CECloudLabs;

public class Min_Max_Element 
{
	public static void printMinMax(int[] arr)
	{
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];	
			}
		}
		System.out.println("Minimum number is: "+min);
		System.out.println("Maximum number is: "+max);

	}
	public static void main(String[] args)
	{
		int[] arr= {6,4,8,2,67,73,34};
		printMinMax(arr);
	}

}
