package Arrays;

//print common element between two arrays

public class Common_Elements_Between_Two_Array 
{
	public static void print(int[] arr1,int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr1= {2,4,6,7,9,11,0};
		int[] arr2= {3,4,5,2,7,6};
		
		print(arr1,arr2);
		
	}

}
