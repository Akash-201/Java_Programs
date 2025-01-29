package Arrays;

public class Palindrome_Element 
{
	public static boolean checkPalindrome(int n)
	{
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
			
		}
		return rev==temp;
	}
	
	public static void printPalindrome(int[] arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(checkPalindrome(arr[i]))
			{
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		System.out.println("\nTotal Palindrome Number Are:- "+count);
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {11,123,121,234,23432,151};
		printPalindrome(arr);
		
	}

}
