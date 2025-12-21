package HackerRank;

public class ValidPAN_Format 
{
	public static String isValidPanFormat(String str)
	{
	 str=str.trim();
	    if(str.length()!=10)
	    {
	        return "NO";
	    }
	    for(int i=0;i<5;i++)
	    {
	        if(!Character.isUpperCase(str.charAt(i)))
	        {
	            return "NO";
	        }
	    }
	    for(int i=5;i<9;i++)
	    {
	        if(!Character.isDigit(str.charAt(i)))
	        {
	            return "NO";
	        }
	    }
	    if(!Character.isUpperCase(str.charAt(9)))
	    {
	       return "NO";
	    }
	    return "YES";
	 
	}
	    public static void main(String[] args)
	     {
	         System.out.println(isValidPanFormat("ABCDS1234Y"));  // YES
	         System.out.println(isValidPanFormat("avCDS1234Y"));  // NO
	         System.out.println(isValidPanFormat("ABAB12345Y"));  // NO
	    }

}
