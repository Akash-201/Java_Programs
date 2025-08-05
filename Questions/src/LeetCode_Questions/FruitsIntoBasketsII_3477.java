package LeetCode_Questions;

public class FruitsIntoBasketsII_3477
{
	 public static int numOfUnplacedFruits(int[] fruits, int[] baskets)
	 {
		 int unPaired=0;
		 for(int num : fruits)
		 {
			 boolean paired=false;
			 for(int i=0;i<baskets.length;i++)
			 {
				 if(num<=baskets[i] && baskets[i]!=-1)
				 {
					 baskets[i]=-1;
					 paired=true;
					 break;
				 }
			 }
			 if(!paired)
			 {
				 unPaired++;
			 }
		 }
		 return unPaired;
	 }
	 public static void main(String[] args) 
	 {
		 int[] fruits= {3,6,1};
		 int[] baskets= {6,4,7};
		 System.out.println(numOfUnplacedFruits(fruits, baskets));
		
	}

}
