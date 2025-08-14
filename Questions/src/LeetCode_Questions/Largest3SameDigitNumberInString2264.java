package LeetCode_Questions;

//LeetCode: 2264. Largest 3-Same-Digit Number in String

public class Largest3SameDigitNumberInString2264 
{
	public static String largestGoodInteger(String num)
	{
		char prev='A';
		int count=0;
		char maxDigit=' '; // 32 ASCII value
		
		for(char current : num.toCharArray())
		{
			if(current==prev)
			{
				count++;
			}
			else
			{
				count=1;
			}
			if(count==3)
			{
				maxDigit=(char)Math.max(maxDigit, current);
			}
			prev=current;
		}
		if(maxDigit==' ')
		{
			return "";
		}
		StringBuilder result=new StringBuilder();
		for(int i=1;i<=3;i++)
		{
			result.append(maxDigit);
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String num = "6777133339";
		System.out.println(largestGoodInteger(num));
	}

}
