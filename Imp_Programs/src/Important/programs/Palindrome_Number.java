package Important.programs;

public class Palindrome_Number
{
	public static void check(int n)
	{
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a Palindrome Number");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome Number");
		}
	}
	public static void main(String[] args) {
		check(121);
	}

}
