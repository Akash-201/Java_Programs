package CompanyQuestions;
// Given an integer array arr, return true if any value appears at least twice in the array,
//and return false if every element is distinct

public class ContainDuplicate
{
	public static boolean checkDuplicate(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return true;
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,1};
		System.out.println(checkDuplicate(arr));
	}

}
