package ForPracticePurpose;

public class CommonElementInTwoArray
{
	public static void commonElement(int[] arr1,int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					
				}
				
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr1= {2,1,4,6,3};
		int[] arr2= {1,7,8,3,2};
		commonElement(arr1, arr2);
		
		
	}

}
