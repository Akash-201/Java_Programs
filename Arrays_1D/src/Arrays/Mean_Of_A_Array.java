package Arrays;
//The mean (average) of a data set is found by adding all numbers in the data set 
//and then dividing by the number of values in the set

public class Mean_Of_A_Array
{
	public static void meanOfArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		float  mean= (float) sum/arr.length;
		System.out.println("Mean (Average): "+mean);
	}
	public static void main(String[] args) {
		int[] arr= {1,3,4,7,9,11};
		meanOfArray(arr);
	}

}
