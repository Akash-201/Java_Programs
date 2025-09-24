package HackerRank;

public class TaumAndBday 
{
	public static long taumBday(int b, int w, int bc, int wc, int z) 
	{
		long blackCost = Math.min(bc, wc + z); // choose cheaper way to get black
		long whiteCost = Math.min(wc, bc + z); // choose cheaper way to get white
		return (long)b * blackCost + (long)w * whiteCost;
	}

	public static void main(String[] args)
	{
		System.out.println(taumBday(10,10,1,1,1));  // 20
		System.out.println(taumBday(3,5,3,4,1));   // 29

	}


}
