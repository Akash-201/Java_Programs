package Arrays;

public class RightRotation 
{
	public static void rightRotate(int[] arr)
	{
		int lastIndex=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=lastIndex;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		rightRotate(arr);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}

}
