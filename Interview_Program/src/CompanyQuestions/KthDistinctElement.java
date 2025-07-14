package CompanyQuestions;

/*  Given an integer array arr, return the k-th distinct element (i.e., an element that appears only once,
in the order it appears in the array).
If fewer than k distinct elements exist, return -1
*/

public class KthDistinctElement
{
	public static int distinctElement(int[] arr, int k)
	{
		int count1=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==-1)
				continue;
			int count=0;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}
			if(count==0)
			{
				count1++;
				if(count1==k)
				{
					return arr[i];
					
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,3,2,4,3};
		int k=3;
		System.out.println(distinctElement(arr, k));
		
	}
}
