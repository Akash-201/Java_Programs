package CompanyQuestions;

public class FindDuplicateNumber
{
	public static void findDuplicateNumber(int[] arr)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
					count++;
				}
			}
			if(count>1 && arr[i]!=-1)
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,3,4,2,2,4,2};
		findDuplicateNumber(arr);
	}

}
