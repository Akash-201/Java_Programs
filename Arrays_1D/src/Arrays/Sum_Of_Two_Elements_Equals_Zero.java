package Arrays;

public class Sum_Of_Two_Elements_Equals_Zero
{
	public static void check(int[] arr)
	{
		boolean found=false;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==0)
				{
					System.out.print(arr[i]+" "+arr[j]+" ");
					found=true;
				}
				
			}
			
		}
		if(!found)
		{
			System.out.println("No Match");
		}
	}

	public static void main(String[] args)
	{
		int[] arr= {5,2,3,-5,1};
		check(arr);
		
	}
}
