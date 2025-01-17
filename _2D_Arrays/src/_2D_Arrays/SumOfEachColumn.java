package _2D_Arrays;

public class SumOfEachColumn 
{
	public static void add(int[][] a)
	{
		for(int i=0;i<a[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum+=a[j][i];
				
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		add(a);
	}

}
