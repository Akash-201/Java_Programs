package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets 
{
	 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
		 int alice_Score=0;
		 int bob_Score=0;
		 
		 for(int i=0;i<a.size();i++)
		 {
			 if(a.get(i)>b.get(i))
			 {
				 alice_Score++;
			 }
			 if(a.get(i)<b.get(i))
			 {
				 bob_Score++;
			 }
		 }
		 List<Integer> ans=new ArrayList<>();
		 ans.add(alice_Score);
		 ans.add(bob_Score);
		 
		 return ans;
	 }
	 public static void main(String[] args) 
	 {
		 List<Integer> a=Arrays.asList(5,6,7);
		 List<Integer> b=Arrays.asList(3,6,10);
		 
		 System.out.println(compareTriplets(a, b));
		
	}

}
