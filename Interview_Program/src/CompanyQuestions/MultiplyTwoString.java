package CompanyQuestions;

public class MultiplyTwoString 
{
	public static String multiplyString(String str1,String str2)
	{
		if(str1.equals("0") || str2.equals("0")) return "0";
		
		String res1="";
		String res2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			res1+=str1.charAt(i);
		}
		for(int i=str2.length()-1;i>=0;i--)
		{
			res2+=str2.charAt(i);
		}
		
		int[] result=new int[res1.length()+res2.length()];
		
		for(int i=0;i<res1.length();i++)
		{
			for(int j=0;j<res2.length();j++)
			{
				result[i+j]+=(res1.charAt(i)-'0')*(res2.charAt(j)-'0');
				result[i+j+1]+=result[i+j]/10;
				result[i+j]%=10;
			}
		}
		String answer="";
		boolean zero=true;
		for(int i=result.length-1;i>=0;i--)
		{
			if(result[i]!=0) zero=false;
			if(zero==false)  answer+=result[i];
		}
		return answer;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(multiplyString("2","3"));
		System.out.println(multiplyString("123","456"));
		
	}

}
