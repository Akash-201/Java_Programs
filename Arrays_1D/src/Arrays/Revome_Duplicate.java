package Arrays;

public class Revome_Duplicate 
{
	public static void print(int[] arr)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			int c=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,5,3,7,9,11,13,1};
		print(arr);
	}

}
