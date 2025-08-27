package HackerRank;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum 
{
	 public static int simpleArraySum(List<Integer> ar)
	 {
		 int sum=0;
		 for(int num : ar)
		 {
			 sum+=num;
		 }
		 return sum;
	 }
	 public static void main(String[] args) {
		 List<Integer> ar = Arrays.asList(1, 2, 3, 4, 10, 11);
		System.out.println(simpleArraySum(ar));
	}

}
