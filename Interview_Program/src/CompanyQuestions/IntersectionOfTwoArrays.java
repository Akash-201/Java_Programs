package CompanyQuestions;


import java.util.Arrays;

public class IntersectionOfTwoArrays
{
	public static void intersectionOfTwoArrays(int[] arr1,int[] arr2)
	{
		int[] newArr=new int[Math.min(arr1.length, arr2.length)];
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					newArr[index]=arr1[i];
					index++;
					arr2[j]=-1;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(newArr, index)));
	}
	public static void main(String[] args)
	{
		int[] arr1= {4,9,5};
		int[] arr2= {9,4,9,8,4};
		intersectionOfTwoArrays(arr1, arr2);
	}

}
