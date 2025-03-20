package CompanyQuestions;

// add(minElement + maxElement)/2 to average
// input: [7,8,3,4,15,13,4,1]
// output: 5.5

// input: [1,2,3,7,8,9]
// output: 5.0

import java.util.Arrays;

public class AverageOfSmallestAndLargest
{
	public static void averageNumber(int[] arr)
	{
		
		Arrays.sort(arr);
		double average = 0;
		int smallest=0;
		int largest=arr.length-1;
		
		while(smallest<largest) {
			average=(arr[smallest]+arr[largest])/2.0;
			smallest++;
			largest--;
		}
		System.out.println(average);


	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,7,9,8};
		int[] arr1= {7,8,3,4,15,13,4,1};
		averageNumber(arr);
		averageNumber(arr1);
	}

}
