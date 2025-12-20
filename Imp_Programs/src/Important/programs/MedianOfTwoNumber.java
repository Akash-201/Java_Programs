package Important.programs;

public class MedianOfTwoNumber 
{
	public static void findMedian(int a,int b)
	{
//		int median=(a+b)/2;
		
		// To avoid Integer Overflow, use this formula
		int median=a+(b-a)/2;
		
		System.out.println(median);
	}
	public static void main(String[] args) {
		findMedian(30,50);
	}

}
