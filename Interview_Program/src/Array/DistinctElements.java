package Array;

// distinct elements are all different values, regardless of their occurance count

public class DistinctElements
{
	public static void distinctElements(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,4,4,7,1,9,0,8,7,13,9};
		distinctElements(arr);
	}

}
