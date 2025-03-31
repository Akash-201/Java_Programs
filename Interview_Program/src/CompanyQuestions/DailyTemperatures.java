package CompanyQuestions;

//Given an array of integers temperatures represents the daily temperatures,
//return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
//If there is no future day for which this is possible, keep answer[i] == 0 instead.

//Example 1:

//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]

//Example 2:

//Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]

//Example 3:

//Input: temperatures = [30,60,90]
//Output: [1,1,0]


import java.util.Arrays;

public class DailyTemperatures 
{
	public static void dailyTemperatures(int[] arr)
	{
		int[] days=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] > arr[i])
				{
					days[i]= j-i;
					break;
					
				}
			
			}
			
		}
		System.out.println(Arrays.toString(days));
	}
    public static void main(String[] args)
    {
    	int[] arr= {73,74,75,71,69,72,76,73};
    	int[] arr1= {30,40,50,60};
    	dailyTemperatures(arr);
    	dailyTemperatures(arr1);
    }

}
