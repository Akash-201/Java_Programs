package LeetCode_Questions;
// Leetcode:- 43. Multiply Strings

public class MultiplyStrings43
{
	public static String multiply(String num1, String num2)
	{
		if(num1.equals("0") || num2.equals("0")) return "0";

		int n1=num1.length();
		int n2=num2.length();
		int[] result=new int[n1+n2];

		for(int i=n1-1;i>=0;i--)
		{
			for(int j=n2-1;j>=0;j--)
			{
				int multiply=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');

				int sum=result[i+j+1]+multiply; 
				result[i+j]+=sum/10;
				result[i+j+1]=sum%10;

			}
		}
		StringBuilder sb = new StringBuilder();
		for(int num : result)
		{
			if (!(sb.length() == 0 && num == 0)) {
				sb.append(num);
			}
		}
		return sb.length() == 0 ? "0" : sb.toString();

	}
	public static void main(String[] args)
	{
		System.out.println(multiply("2", "3"));  // "66"
		System.out.println(multiply("123", "456")); // "56088"

	}

}
