package CompanyQuestions;

public class HappyNumber 
{
	public static boolean checkHappyNumber(int n)
	{
		if(n==1)
			return true;
		if(n==4)
			return false;
		
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		//n=sum;
		//return checkHappyNumber(n);
		
		return checkHappyNumber(sum);
	}
	public static void main(String[] args) {
		int n=19;
		System.out.println(checkHappyNumber(n));
	}

}
