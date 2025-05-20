package CompanyQuestions;

// Find the average of  all positive Numbers in an Array

public class AverageOfPositiveNumber
{
	public static void findAverage(int[] arr)
	{
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				sum+=arr[i];
				count++;
			}
		}
		if(count>0)
		{
			double average=sum/count;
			System.out.println("Average of all positive number: "+average);
		}
		else 
		{
			System.out.println("There is no any positive number in this Array");

		}
	}
	public static void main(String[] args)
	{
		int[] arr= {-3,-2,0,-7,25,12,-11};
		findAverage(arr);
	}

}
