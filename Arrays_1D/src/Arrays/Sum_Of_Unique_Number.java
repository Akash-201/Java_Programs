package Arrays;

public class Sum_Of_Unique_Number 
{
	public static void sumOfUniqueNumber(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum Of Unique Elements Are: "+sum);
	}
	public static void main(String[] args) {
		int[] arr= {10,15,15,20,10,30};
		sumOfUniqueNumber(arr);
		
	}

}
