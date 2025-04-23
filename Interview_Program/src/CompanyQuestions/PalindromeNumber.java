package CompanyQuestions;
//check given Number are Palindrome number or not


public class PalindromeNumber
{
	public static boolean checkPalindrome(int n)
	{
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			return true;
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		int n=121;
		System.out.println(checkPalindrome(n));
	}

}
