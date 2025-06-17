package _4CECloudLabs;

//2
//4 6
//8 10 12
//14 16 18 20

public class Pattern2 
{
	public static void print(int n)
	{
		int num=2;
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
		int n=4;
		print(n);
	}
	

}
