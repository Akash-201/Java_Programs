package Sorting;

import java.util.Arrays;

public class BubbleSortForString 
{
	public static void bubbleSort(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			int flag=0;
			for(int j=0;j<str.length-1-i;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(str));
	}
	public static void main(String[] args)
	{
		String[] str= {"Apple","Mango","Banana","PineApple"};
		bubbleSort(str);
	}


}
