package HackerRank;

public class MarsExploration 
{
	public static int marsExploration(String s) 
	{
		int changes = 0;
		String sos = "SOS";

		for (int i = 0; i < s.length(); i++) 
		{

			if (s.charAt(i) != sos.charAt(i % 3))
			{
				changes++;
			}
		}

		return changes;
	}
	public static void main(String[] args) 
	{
		String s="SOSSOT";
		System.out.println(marsExploration(s));  // 1

		String s2="SOSSOSSOS";
		System.out.println(marsExploration(s2));  // 0

	}
}
