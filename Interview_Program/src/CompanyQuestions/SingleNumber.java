package CompanyQuestions;

public class SingleNumber 
{
	public static void findSingleNumber(int[] arr)
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
			if(arr[i]!=-1 && count==1)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
    public static void main(String[] args)
    {
    	int[] arr= {4,1,2,1,2};
    	int[] arr1= {1};
    	int[] arr2= {2,2,8,9};
    	findSingleNumber(arr);
    	findSingleNumber(arr1);
    	findSingleNumber(arr2);
    }

}
