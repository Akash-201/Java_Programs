package Important.programs;

public class Nth_UglyNumber
{
	public static int nthUglyNumber(int n)
	{
		if(n<=0) return 0;
		int count=0;
		for(int i=1;;i++)
		{
			if(checkUglyNumber(i))
			{
				count++;
			}
			if(count==n)
			{
				return i;
			}
		}
	}
	private static boolean checkUglyNumber(int n)
	{
		if(n<=0) return false;
		while(n%2==0) n/=2;
		while(n%3==0) n/=3;
		while(n%5==0) n/=5;

		return n==1;
	}
	public static void main(String[] args) 
	{
		System.out.println(nthUglyNumber(10)); // 12
		System.out.println(nthUglyNumber(7)); // 8
	}
}
