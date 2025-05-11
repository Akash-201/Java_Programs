package Array;

public class ThreeConsecutiveOdds
{
	public static boolean checkThreeConsecutiveOdds(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]%2!=0)
			{
				count++;
				if(count==3)
				{
					return true;
				}
			}
			else
			{
				count=0;
			}
			
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] arr= {2,6,4,1};
		int[] arr1= {1,2,34,3,4,5,7,23,12};
		System.out.println(checkThreeConsecutiveOdds(arr));
		System.out.println(checkThreeConsecutiveOdds(arr1));
	}

}
