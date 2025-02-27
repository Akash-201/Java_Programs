package Array;

public class FrequencyOfElements 
{
	public static void frequencyOfElement(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
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
			if(arr[i]!=-1)
			{
				System.out.println(arr[i]+" ---> "+ count);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,5,2,56,1,5,5,1,99};
		frequencyOfElement(arr);
	}

}
