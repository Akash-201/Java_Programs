package CompanyQuestions;

public class RemoveDuplicateFromSortedArray
{
	public static void removeDuplicate(int[] arr)
	{
		int count=1;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
					count++;
				}
			}
			if(arr[i]!=-1)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println("\nAfter removing duplicate ,size of array is: "+count);
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,1,2};
		removeDuplicate(arr);
	}

}
