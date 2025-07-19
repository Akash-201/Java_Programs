package CompanyAsked;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238
{
	public static int[] productExceptSelf(int[] nums)
     {
        int n=nums.length;
        int[] res=new int[n];
        int productLeft=1;
        int productRight=1;

        for(int i=n-1;i>=0;i--)
        {
            res[i]=productRight;
            productRight*=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            res[i]=productLeft*res[i];
            productLeft*=nums[i];
        }

        return res;
        
     }
	public static void main(String[] args)
	{
		int[] nums= {1,2,3,4};
		
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
        

}
