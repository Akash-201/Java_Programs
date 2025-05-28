package Array;

public class SumOfElementsAppearsOnlyOnce 
{
	public static void sumOfElements(int[] arr)
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr= {10,15,15,20,10,30};
		sumOfElements(arr);
	}

}
