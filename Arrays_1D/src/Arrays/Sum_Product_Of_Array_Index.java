package Arrays;

public class Sum_Product_Of_Array_Index
{
	public static void print(int[] arr)
	{
		int sum=0;
		int product=1;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			product=product*arr[i];
		}
		System.out.println("Sum of element are:- "+sum);
		System.out.println("Product of element are:- "+product);
		
	}
	public static void main(String[] args) 
	{
		int []arr= {1,2,3,4,5};
		print(arr);
		
	}

}
