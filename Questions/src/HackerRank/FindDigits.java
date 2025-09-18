package HackerRank;

public class FindDigits 
{
	public static int findDigits(int n) 
	{
		int count=0;
		int original=n;
		while(n>0)
		{
			int rem=n%10;

			if(rem!=0 && original % rem == 0 )
			{
				count++;
			}
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args)
	{
		System.out.println(findDigits(12));  // 2
		System.out.println(findDigits(1024)); // 3
	}

}
