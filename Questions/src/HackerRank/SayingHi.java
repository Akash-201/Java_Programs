package HackerRank;

public class SayingHi 
{
	public static void sayingHi(String s)
    {
        
        if(s.length()>=3 && (s.startsWith("HI ") || s.startsWith("Hi ")
        		|| s.startsWith("hi ") || s.startsWith("hI ")) 
        		&& !((s.charAt(3)=='D') || (s.charAt(3)=='d')))
         {
           System.out.println(s);
        }
       
    }
	public static void main(String[] args) 
	{
		String s1="Hi Alex how are you doing";
		String s2="hI dave how are you doing";
		String s3="Good by Alex";
		String s4="hidden agenda";
		String s5="Alex greeted Martha by saying Hi Martha";
		
		sayingHi(s1);
		sayingHi(s2);
		sayingHi(s3);
		sayingHi(s4);
		sayingHi(s5);
		
	}

}
