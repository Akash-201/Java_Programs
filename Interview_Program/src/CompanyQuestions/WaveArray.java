package CompanyQuestions;

import java.util.Arrays;

public class WaveArray 
{
	public static void print(int[] arr)
	{
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i+=2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,4,1};
		print(arr);
	}

}
