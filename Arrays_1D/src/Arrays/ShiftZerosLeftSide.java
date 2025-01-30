package Arrays;

public class ShiftZerosLeftSide 
{
	public static int[] shiftZeros(int[] arr)
	{
		int[] newArr=new int[arr.length];
		int index=arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				newArr[index]=arr[i];
				index--;
			}
		}
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,0,6,0,5,9,0,7,0};
		int[] arr2=shiftZeros(arr);
		
		for(int i : arr2)
		{
			System.out.print(i+" ");
		}
	}

}
