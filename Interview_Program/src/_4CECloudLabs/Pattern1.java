package _4CECloudLabs;

// 1
// 3 5
// 7 9 11
// 13 15 17 19

public class Pattern1 
{
	public static void print(int n)
	{
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=2;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		print(4);
	}
	
	

}
