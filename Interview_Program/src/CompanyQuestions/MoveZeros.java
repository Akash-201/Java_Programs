package CompanyQuestions;

import java.util.Arrays;

public class MoveZeros
{
	public static void moveZeros(int[] arr)
	{
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			arr[index]=arr[i];
			index++;
			}
		}
		while(index < arr.length)
		{
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		int[] arr= {0,1,0,3,12};
		moveZeros(arr);
	}

}
