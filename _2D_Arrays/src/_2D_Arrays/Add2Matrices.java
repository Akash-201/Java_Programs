package _2D_Arrays;

public class Add2Matrices
{
	public static void add(int[][] a,int[][] b)
	{
		int[][] c=new int[a.length][b.length];
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
		add(a,b);
	}

}
