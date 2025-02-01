package Arrays;

// sort 0 and 1 means 0 left side and 1 right side

public class Sort_0_And_1 
{
	public static void sort(int[] arr)
	{
		int[] newArr=new int[arr.length];
		int lastIndex=arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==1)
			{
				newArr[lastIndex]=arr[i];
				lastIndex--;
			}
		}
		for(int ele : newArr)
		{
			System.out.print(ele+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,0,1,1,0,1};
		sort(arr);
	}
}
