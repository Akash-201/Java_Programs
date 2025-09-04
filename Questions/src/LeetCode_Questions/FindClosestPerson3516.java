package LeetCode_Questions;

public class FindClosestPerson3516 
{
	public static int findClosest(int x, int y, int z) 
	{
		int person1=Math.abs(z-x);
		int person2=Math.abs(z-y);

		if(person1<person2)
		{
			return 1;
		}
		else if(person2<person1)
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(findClosest(2,7,4));  // 1
		System.out.println(findClosest(2,5,6));  // 2
		System.out.println(findClosest(1,5,3));  // 0
		
	}
}
