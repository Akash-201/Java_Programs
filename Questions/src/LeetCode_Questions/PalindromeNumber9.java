package LeetCode_Questions;

public class PalindromeNumber9 
{
	public static boolean isPalindrome(int x)
	{
		if(x<0)
			return false;
		int rev=0;
		int n=x;

		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==x)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		int x=121;
		System.out.println(isPalindrome(x));
	}

}
