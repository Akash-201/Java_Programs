package TwoPointer;



public class TwoSum 
{
	public static void findElements(int[] arr,int target)
	{
		int left=0;
		int right=arr.length-1;

		while(left<right)
		{
			int sum=arr[left]+arr[right];
			if(sum==target)
			{
				System.out.println("Pair found at indices: " + left + ", " + right);
				System.out.println("Values: " + arr[left] + ", " + arr[right]);
				return;
			}
			else if(sum>target)
			{
				right--;
			}
			else {
				left++;
			}
		}
		System.out.println("No Pair found");
	}
	public static void main(String[] args)
	{
		int[] arr= {1,3,5,6,9};
		int target=11;
		findElements(arr, target);

	}

}
