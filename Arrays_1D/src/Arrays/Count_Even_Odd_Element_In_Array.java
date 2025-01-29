package Arrays;

public class Count_Even_Odd_Element_In_Array
{
	public static void count(int[] arr)
	{
		int even=0;
		int odd=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Total Even element are:- "+even);
		System.out.println("Total Odd element are:- "+odd);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,8};
		count(arr);
	}

}
