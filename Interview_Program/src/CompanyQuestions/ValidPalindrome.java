package CompanyQuestions;

public class ValidPalindrome
{
	public static boolean checkPalindrome(String str)
	{
		str=str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

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
	public static void main(String[] args) {
		System.out.println(checkPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(checkPalindrome("race a car"));

	}

}
