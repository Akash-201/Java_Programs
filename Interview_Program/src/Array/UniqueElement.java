package Array;

// unique elements appear exactly once

public class UniqueElement 
{
	public static void uniqueElement(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1 && count==1)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {4,6,3,6,6,3,7,9,4};
		uniqueElement(arr);
	}

}
