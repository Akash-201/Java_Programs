package Arrays;

// print duplicate element

public class Duplicate_Element
{
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1 && count>1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,5,3,7,9,11,5,13,1};
		print(arr);
	}

}
