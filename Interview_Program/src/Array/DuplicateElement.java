package Array;

public class DuplicateElement 
{
	public static void duplicateElement(int[] arr)
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
			if(count>1 && arr[i]!=-1)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,4,6,3,1,6};
		duplicateElement(arr);
	}

}
