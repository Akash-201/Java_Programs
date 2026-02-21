package LeetCode_Questions;

// Leetcode:-  482. License Key Formatting

public class LicenseKeyFormatting482 
{
	public static String licenseKeyFormatting(String s, int k) 
	{
		String s1=s.replaceAll("-", "").toUpperCase();
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		String s2 = sb.toString();
		StringBuilder sb1=new StringBuilder();
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			if(count==k)
			{
				sb1.append("-");
				count=0;
			}
			sb1.append(s2.charAt(i));
			count++;

		}
		return sb1.reverse().toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(licenseKeyFormatting("5F3Z-2e-9-w",4));  // 5F3Z-2E9W
		System.out.println(licenseKeyFormatting("2-5g-3-J",2));  // 2-5G-3J

	}

}
