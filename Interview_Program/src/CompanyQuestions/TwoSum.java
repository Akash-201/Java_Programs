package CompanyQuestions;

public class TwoSum 
{
	public static void printTwoSum(int[] arr,int target)
	{
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+" "+j);
					found=true;
					
				}
			}
		}
		if(!found)
		{
			System.out.println("No valid pair found");
		}
		
	}
	public static void main(String[] args)
	{
		int[] arr= {2,7,11,15,-2};
		int target= 9;
		printTwoSum(arr, target);
	}

}
