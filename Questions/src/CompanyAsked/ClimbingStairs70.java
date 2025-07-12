package CompanyAsked;

public class ClimbingStairs70 
{
	public static int climbStairs(int n) 
	{
		if(n<=2)
		{
			return n;
		}
		int a=1;
		int b=2;
		
		for(int i=3;i<=n;i++)
		{
			int temp=a+b;
			a=b;
			b=temp;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println(climbStairs(6));
	}

}
