package CompanyQuestions;



public class FindClosestNumberToZero 
{
	public static int closestNumber(int[] arr)
	{
		int nearestNumber=Math.abs(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			if(Math.abs(arr[i]) < nearestNumber)
			{
				nearestNumber=Math.abs(arr[i]);
			}
		}
		return nearestNumber;
	}
	public static void main(String[] args)
	{
		int[] arr= {-4,-2,1,4,8};
		int[] arr1= {2,-9,6};
		
		System.out.println(closestNumber(arr));  // output 1
		System.out.println(closestNumber(arr1));  // output 2
	}

}
