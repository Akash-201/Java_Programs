package HackerRank;

public class LibraryFine
{
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) 
	{
	    if (y1 > y2)
	    {
	        return 10000;
	    }
	    else if (y1 == y2) 
	    {
	        if (m1 > m2) 
	        {
	            return (m1 - m2) * 500;
	        } 
	        else if (m1 == m2 && d1 > d2) 
	        {
	            return (d1 - d2) * 15;
	        }
	    }
	    return 0;
	}
	public static void main(String[] args)
	{
		System.out.println(libraryFine(9,6,2015,6,6,2015));   // 45
		System.out.println(libraryFine(14,7,2018,5,7,2018));  // 135
	}

}
