package TwoPointer;

public class ReverseString 
{
	public static void reverseString(String str)
	{
		char[] ch=str.toCharArray();
		
		int left=0;
		int right=ch.length-1;
		
		while(left<right)
		{
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		
		String reverse=new String(ch);
		System.out.println(reverse);
	}

	public static void main(String[] args)
	{
		String str="abcd";
		reverseString(str);
	}
}
