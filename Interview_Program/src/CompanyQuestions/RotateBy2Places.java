package CompanyQuestions;

// Given two strings s1 and s2, check if s2 can be obtained by rotating s1 exactly 2 places (either clockwise or anti-clockwise).

public class RotateBy2Places 
{
	public static boolean checkContain(String s1, String s2)
	{
		String clockWise=s1.substring(2)+s1.substring(0,2);
		String antiClockWise = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);

		return (s2.equals(antiClockWise) || s2.equals(clockWise));
	}
	public static void main(String[] args) {
		String s1="amazon";
		String s2="azonam";
		System.out.println(checkContain(s1, s2));
	}

}
