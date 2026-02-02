package GeeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements 
{
	public static ArrayList<Integer> commonElements(int a[], int b[]) 
	{
		Arrays.sort(a);
		Arrays.sort(b);
		ArrayList<Integer> list=new ArrayList<>();

		int i=0;
		int j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]==b[j])
			{
				list.add(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
		return list;
	}
	public static void main(String[] args)
	{
		int[] a= {3, 4, 2, 2, 4};
		int[] b= {3, 2, 2, 7};
		System.out.println(commonElements(a, b));  // [2, 2, 3]

		int[] a2= {3, 6, 1, 7, 9, 8, 2, 2};
		int[] b2= {9, 7, 3, 4, 9};
		System.out.println(commonElements(a2, b2));  // [3, 7, 9]


	}

}
