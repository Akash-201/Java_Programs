package Important.programs;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber 
{
	public static boolean isHappyNumber(int n)
	{
		if(n<=0) return false;

		Set<Integer> seen=new HashSet<Integer>();
		while(n!=1 && !seen.contains(n))
		{
			seen.add(n);
			n=sumOfSquare(n);
		}
		return n==1;
	}

	private static int sumOfSquare(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem*rem;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(isHappyNumber(19));
		System.out.println(isHappyNumber(2));
		System.out.println(isHappyNumber(81));
		
		
	}
}
