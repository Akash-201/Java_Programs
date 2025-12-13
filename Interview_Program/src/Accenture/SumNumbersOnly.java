package Accenture;

public class SumNumbersOnly
{
	public static int printSum(String[] arr)
	{
		int sum=0;
		for(String value : arr)
		{
			try 
			{
				int num=Integer.parseInt(value);
				sum+=num;

			} 
			catch (NumberFormatException e) {

			}

		}
		return sum;
	}
	public static void main(String[] args)
	{
		String[] arr= {"First", "2", "3rd", "4"};
		System.out.println(printSum(arr));  // 6

		String[] arr2= {"First", "2frf", "3rd", "frt4"};
		System.out.println(printSum(arr2)); // 0

	}

}
