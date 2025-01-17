package _2D_Arrays;

public class MakeMatrix 
{
	public static void make(int[][] a)
	{

		for(int i=0;i<=a.length-1;i++) 
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
 				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		make(a);
	}

}
