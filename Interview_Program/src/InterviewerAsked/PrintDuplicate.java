package InterviewerAsked;

import java.util.HashSet;

public class PrintDuplicate 
{
	public static void printDuplicate(int[] arr)
	{
		HashSet<Integer> duplicate=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && !duplicate.contains(arr[i]))
				{
					System.out.print(arr[i]+" ");
					duplicate.add(arr[i]);
					break;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {1,4,2,7,1,7,1,9,1};
		printDuplicate(arr);
	}

}
