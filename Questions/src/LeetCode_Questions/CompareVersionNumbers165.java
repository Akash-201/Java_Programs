package LeetCode_Questions;

// LeetCode: 165. Compare Version Numbers

public class CompareVersionNumbers165
{
	public static int compareVersion(String version1, String version2)
	{
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");

		int count = Math.max(v1.length, v2.length);

		for (int i = 0; i < count; i++)
		{
			int a = i < v1.length ? Integer.parseInt(v1[i]) : 0;
			int b = i < v2.length ? Integer.parseInt(v2[i]) : 0;

			if (a > b) 
			{
				return 1;
			}
			else if (a < b)
			{
				return -1;
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		System.out.println(compareVersion("1.01","1.001"));  // 0
		System.out.println(compareVersion("1.2","1.10"));  // -1
		System.out.println(compareVersion("1.0","1.0.0.0")); // 0

	}

}
