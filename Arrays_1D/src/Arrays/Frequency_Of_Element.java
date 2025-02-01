package Arrays;

public class Frequency_Of_Element 
{
	public static void count(int[] arr)
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
			if(arr[i]!=-1)
			{
			 System.out.println(arr[i]+" ---> "+count);	
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,1,6,2,7,5,2,6,9,3,9};
		count(arr);
		
		

	}

}
