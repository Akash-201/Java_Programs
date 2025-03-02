package Array;

public class EvenOdd 
{
	public static void checkEvenOdd(int n)
	{
		System.out.println((n & 1)==0 ? "even" : "odd");
	}
	public static void main(String[] args) {
		checkEvenOdd(37);
	}

}
