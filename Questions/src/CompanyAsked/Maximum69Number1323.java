package CompanyAsked;

public class Maximum69Number1323 
{
	public static int maximum69Number(int num)
	{
		String s=String.valueOf(num);
		char[] digits=s.toCharArray();
		
		for(int i=0;i<digits.length;i++)
		{
			if(digits[i]=='6')
			{
				digits[i]='9';
				break;
			}
		}
		
		String newString=new String(digits);
		return Integer.parseInt(newString);
	}
	public static void main(String[] args)
	{
		int num=9669;
		System.out.println(maximum69Number(num));
		
	}

}
