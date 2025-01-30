package Arrays;

public class Rotate_Array_In_Left_By_K_Times
{
	
	// method to rotate array in left side by 1 times
	public static void rotate(int[] arr)
	{
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		
	}
	
	// method to left rotate array by k times
	
	public static void  rotateByK(int[] arr,int k)
	{
		k = k % arr.length;
		for(int i=1;i<=k;i++)
		{
			rotate(arr);
		}
	}
	
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7};
		rotateByK(arr,5);
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		
	}

}
