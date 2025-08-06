package InterviewerAsked;

//input: 1  2  3 4
//       5  6  7 8
//       9 10 11 12
//       13 14 15 16

//output: 1 5 9 13 14 10 6 2 3 7 11 15 16 12 8 4

public class Zig_Zag 
{
	public static void printZigZagPattern(int[][] arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			
       	 // Even column index: top to bottom
			if(j%2==0)
			{
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
       	 // Odd column index: bottom to top 

			else
			{
				for(int i=arr.length-1;i>=0;i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}

	}
	public static void main(String[] args) {
		int[][] arr={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printZigZagPattern(arr);
	}

}
