package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks 
{
	public static List<Integer> cutTheSticks(List<Integer> arr) {
	    List<Integer> result = new ArrayList<>();
	    
	    while (!arr.isEmpty()) {
	        // add current stick count
	        result.add(arr.size());
	        
	        // find minimum stick
	        int min = Collections.min(arr);
	        
	        // subtract min from all
	        List<Integer> newArr = new ArrayList<>();
	        for (int length : arr) {
	            int newLength = length - min;
	            if (newLength > 0) {
	                newArr.add(newLength);//keep only sticks still > 0
	            }
	        }
	        arr = newArr; // update list
	    }
	    return result;
	}


	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(5, 4, 4, 2, 2, 8);
		System.out.println(cutTheSticks(arr));
	}

}
