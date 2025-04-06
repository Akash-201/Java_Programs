package CompanyQuestions;

import java.util.Arrays;

public class AnagramString
{
	public static boolean check(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        str1=new String(ch1);
        str2=new String(ch2);
        
        return str1.equals(str2);
        
    }
    public static void main(String[] args)
    {
        String str1="MAM";
        String str2="MAM";
        System.out.println(check(str1,str2));
    }

}
