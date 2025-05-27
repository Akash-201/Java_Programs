package TwoPointer;

public class PalindromeNumber
{
	public static boolean chechPalindrome(int n)
	{
		String str=String.valueOf(n);
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		int n=12321;
		System.out.println(chechPalindrome(n));
	}

}
