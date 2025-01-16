package _2D_Arrays;

public class CountEven 
{
	public static void print(int[][] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		print(a);
	}

}
