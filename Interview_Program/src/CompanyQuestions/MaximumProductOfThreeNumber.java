package CompanyQuestions;

import java.util.Arrays;

public class MaximumProductOfThreeNumber 
{
	public static void maximumProduct(int[] arr)
	{
//		Arrays.sort(arr);
		int product;
		product=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
		System.out.println("Product is: "+product);
	}
	public static void main(String[] args)
	{
		int[] arr= {-1,-2,-3};
		maximumProduct(arr);
	}

}
