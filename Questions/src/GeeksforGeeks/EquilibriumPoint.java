package GeeksforGeeks;

public class EquilibriumPoint
{
	public static int findEquilibrium(int arr[]) 
	{
		int n=arr.length;
		int left=0;
		int right=0;
		for(int x : arr)
			right+=x;
		for(int i=0;i<n;i++)
		{
			right-=arr[i];
			if(left==right) 
				return i;

			left+=arr[i];
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,0,3};
		System.out.println(findEquilibrium(arr)); // 2

		int[] arr2= {1,1,1,1};
		System.out.println(findEquilibrium(arr2)); // -1

		int[] arr3= {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(findEquilibrium(arr3)); // 3

	}
}
