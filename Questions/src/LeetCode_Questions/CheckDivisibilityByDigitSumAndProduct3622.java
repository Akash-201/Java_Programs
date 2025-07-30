package LeetCode_Questions;

public class CheckDivisibilityByDigitSumAndProduct3622
{
	 public static boolean checkDivisibility(int n) 
	 {
		 int sum=0;
		 int product=1;
		 int x=n;
		 while(x>0)
		 {
			 int rem=x%10;
			 sum+=rem;
			 product*=rem;
			 x/=10;
		 }
		 return n%(sum+product)==0;
	 }
	 public static void main(String[] args)
	 {
		 int n=99;
		 System.out.println(checkDivisibility(n));
	 }
}
