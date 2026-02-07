package GeeksforGeeks;

public class MajorityElement 
{
	public static int majorityElement(int arr[]) 
	{
		int majorityCandidate=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==majorityCandidate)
			{
				count++;
			}
			else
			{
				count--;
				if(count==0)
				{
					majorityCandidate=arr[i];
					count=1;
				}
			}
		}
		count=0;
		for(int num : arr)
		{
			if(num==majorityCandidate)
			{
				count++;
			}
		}
		if(count>arr.length/2)
		{
			return majorityCandidate;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1, 1, 2, 1, 3, 5, 1};
		System.out.println(majorityElement(arr));  // 1

		int[] arr2= {7};
		System.out.println(majorityElement(arr2));  // 7

		int[] arr3= {2,13};
		System.out.println(majorityElement(arr3));  // -1

	}

}
