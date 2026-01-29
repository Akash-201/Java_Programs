package HackerRank;

public class BestDivisor 
{
	public static int bestDivisorNumberIs(int n)
	{
		int totalSum=0;
		int bestDivisorNumber=1;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				int temp=i;
				int sum=0;
				while(temp>0)
				{
					int rem=temp%10;
					sum+=rem;
					temp/=10;
				}
				if(totalSum<sum)
				{
					totalSum=sum;
					bestDivisorNumber=i;
				}
			}
		}
		return bestDivisorNumber;
	}
	public static void main(String[] args)
	{
		System.out.println(bestDivisorNumberIs(12)); // 6
		System.out.println(bestDivisorNumberIs(16)); // 8
	}

}
