package Searching;

public class LinearSearchForString 
{
	public static void findString(String[] arr,String str)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(str))
			{
				System.out.println(str+" is present at "+i+" index position");
				return;
			}
		}
		System.out.println(str+" is not present in this list");
	}
	public static void main(String[] args)
	{
		String[] arr= {"Hello","Hii","Byy"};
		String str="Hii";
		findString(arr, str);
	}

}
