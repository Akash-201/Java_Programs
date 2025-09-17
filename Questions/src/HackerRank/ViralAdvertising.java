package HackerRank;

public class ViralAdvertising 
{
	public static int viralAdvertising(int n)
	{
		int shared=5;
		int totalLiked=0;
		
		for(int day=1;day<=n;day++)
		{
			int liked=shared/2;
			totalLiked+=liked;
			shared=liked*3;
		}
		return totalLiked;
	}
	public static void main(String[] args) 
	{
		System.out.println(viralAdvertising(5)); // 24
		System.out.println(viralAdvertising(3)); // 9
	}
}
