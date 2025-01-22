package Important.programs;
//WAJP to generate and print all four-digit Tech numbers.
//•	Example: 2025 => 20 + 25 => 45^2 = 2025


public class All_Four_Digit_Tech_Numbers 
{
	public static void main(String[] args) 
	{
		for(int i=1000;i<=9999;i++)
		{
			int rem=i%100;
			int result=i/100;
			int sum=rem+result;
			if(i==sum*sum)
			{
				System.out.print(i+" ");
			}
		}
		
	}
	

}
