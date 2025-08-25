package LeetCode_Questions;

// LeetCode: 2053. Kth Distinct String in an Array

import java.util.HashMap;

public class KthDistinctStringInAnArray2053 
{
	public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> freqMap=new HashMap<>();

        for(String str : arr)
        {
            freqMap.put(str,freqMap.getOrDefault(str,0)+1);
        }
        for(String str : arr)
        {
            if(freqMap.get(str)==1)
            {
                k--;
            }
            if(k==0)
            {
                return str;
            }
        }
        return "";
    }
	public static void main(String[] args)
	{
		String[] arr= {"d","b","c","b","c","a"};
		String[] arr2= {"aaa","aa","a"};
		String[] arr3= {"a","b","a"};
		
		int k=2;
		int k2=1;
		int k3=3;
		System.out.println(kthDistinct(arr, k));  //a
		System.out.println(kthDistinct(arr3, k3)); // ""
		System.out.println(kthDistinct(arr2, k2)); // aaa
		
	}

}
