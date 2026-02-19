package LeetCode_Questions;
// Leetcode:- 504. Base 7

public class Base_7_504 
{
	public static String convertToBase7(int num) 
	{
		if(num==0) return "0";

		boolean isNegative=num<0;
		num=Math.abs(num);
		
		StringBuilder sb=new StringBuilder();

		while(num>0)
		{
			sb.append(num%7);
			num/=7;
		}
		if(isNegative)
		{
			sb.append("-");
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(convertToBase7(100));  // 202
		System.out.println(convertToBase7(-7));  // -10

	}

}
