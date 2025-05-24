package ForPracticePurpose;

import java.util.ArrayList;
import java.util.List;

public class CommonElementInTwoArray
{
	public static void commonElement(int[] arr1,int[] arr2)
	{
		ArrayList<Integer> commonElement=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(!commonElement.contains(arr1[i]))
					{
						commonElement.add(arr1[i]);
					}
					break;
				}
			}
		}
		System.out.println(commonElement);
	}
	public static void main(String[] args)
	{
		int[] arr1= {2,1,4,6,3};
		int[] arr2= {1,7,8,3,2};
		commonElement(arr1, arr2);


	}

}
