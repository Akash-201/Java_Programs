package LeetCode_Questions;

//LeetCode: 1046. Last Stone Weight

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 
{
	public static int lastStoneWeight(int[] stones) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

		for(int stone : stones)
			pq.add(stone);

		while(pq.size()>1)
		{
			int y=pq.poll();
			int x=pq.poll();

			if(x!=y)
			{
				pq.add(y-x);
			}
		}
		return pq.isEmpty() ? 0 : pq.poll();
	}
	public static void main(String[] args)
	{
		int[] stones= {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones));
	}

}

