package ForPracticePurpose;

import java.util.HashSet;

public class RemoveDuplicate 
{
	public static void removeDuplicate(int[] arr)
	{
		HashSet<Integer> uniqueElement=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!uniqueElement.contains(arr[i]))
			{
				uniqueElement.add(arr[i]);
			}
		}
		System.out.println(uniqueElement);
		
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 4, 1, 5};
		removeDuplicate(arr);
	}

}
