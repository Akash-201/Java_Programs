package Arrays;

public class Even_Odd_Index
{
	public static void print(int []arr)
	{
		System.out.println("Even index position..");
		for(int i=0;i<arr.length;i+=2)
		{

			System.out.print(arr[i]+" ");

		}
		System.out.println();

		System.out.println("Odd index position...");
		for(int i=1;i<arr.length;i+=2)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		print(arr);
	}

}
