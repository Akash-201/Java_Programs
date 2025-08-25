package HackerRank;

public class StrongPassword 
{
	public static int minimumNumber(int n, String password) {
        int missing = 0;

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else hasSpecial = true; 
        }

        if (!hasDigit) missing++;
        if (!hasLower) missing++;
        if (!hasUpper) missing++;
        if (!hasSpecial) missing++;

        return Math.max(missing, 6 - n);
    }
	
	public static void main(String[] args) {
		String password="2bbbb";
		int n=6;
	System.out.println(minimumNumber(n, password));
		
	}

}
