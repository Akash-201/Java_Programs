package _2D_Arrays;

public class SumOfSecondaryDiagonal
{
	public static void add(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i][a.length-1-i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		add(a);
	}


}
