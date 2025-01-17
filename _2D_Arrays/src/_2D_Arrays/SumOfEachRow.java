package _2D_Arrays;

public class SumOfEachRow 
{
	public static void add(int[][] a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			int sum=0;
			for(int j=0;j<=a[i].length-1;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		add(a);
	}

}
