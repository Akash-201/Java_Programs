package Important.programs;

// Repeatedly add digits until result is single digit.

public class DigitalRoot
{
	public static int addDigits(int n)
	{
		while(n>=10)
		{
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum+=rem;
				n/=10;
			}
			n=sum;
		}
		return n;

	}
	public static void main(String[] args)
	{
		System.out.println(addDigits(987));  // 6
		System.out.println(addDigits(9999)); // 9
	}


}
