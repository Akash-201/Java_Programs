package HackerRank;

public class CatsAndA_Mouse 
{
	public static String catAndMouse(int x, int y, int z)
    {
       int result1=Math.abs(x-z);
       int result2=Math.abs(y-z);
       if(result1 > result2)
       {
           return "Cat B";
       }
       else if(result1 < result2)
       {
           return "Cat A";
       }
       else
       {
           return "Mouse C";
       }
    }
	public static void main(String[] args) 
	{
		System.out.println(catAndMouse(1,2,3)); // Cat B
		System.out.println(catAndMouse(1,3,2)); // Mouse C
		
	}


}
