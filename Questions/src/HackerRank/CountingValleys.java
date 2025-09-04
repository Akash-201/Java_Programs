package HackerRank;

public class CountingValleys 
{
	public static int countingValleys(int steps, String path) {
		int altitude=0;
		int valleys=0;
		for(char step : path.toCharArray())
		{
			if(step=='U')
			{
				altitude++;
				if(altitude==0)
				{
					valleys++;
				}
			}
			else{
				altitude--;
			}
		}
		return valleys;

	}
	public static void main(String[] args) {
		System.out.println(countingValleys(8,"UDDDUDUU"));   // 1
		System.out.println(countingValleys(10,"DUUDDUDUUU")); // 3
	}



}
