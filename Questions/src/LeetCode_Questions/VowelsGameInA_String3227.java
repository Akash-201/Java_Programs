package LeetCode_Questions;

public class VowelsGameInA_String3227 
{
	public static boolean doesAliceWin(String s) 
    {
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
            {
                return true;
            }

        }
        return false;
        
    }
	public static void main(String[] args) {
		String s="leetcoder";
		System.out.println(doesAliceWin(s));
	}
}
