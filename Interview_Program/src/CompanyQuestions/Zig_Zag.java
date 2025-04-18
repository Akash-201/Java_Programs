package CompanyQuestions;

// input: 1  2  3 4
//        5  6  7 8
//        9 10 11 12
//        13 14 15 16

// output: 1 5 9 13 14 10 6 2 3 7 11 15 16 12 8 4


public class Zig_Zag 
{
	public static void printNumber(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		
		}
		
	}
	public static void main(String[] args)
	{
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printNumber(arr);
	}

}
