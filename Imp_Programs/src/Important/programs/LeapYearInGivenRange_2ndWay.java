package Important.programs;

import java.util.Scanner;

public class LeapYearInGivenRange_2ndWay 
{
     public static void print(int s,int e)
     {
    	 for(int i=s;i<=e;i++)
    	 {
    		 if(i%400==0 || (i%4==0 && i%100!=0))
    		 {
    			 System.out.print(i+" ");
    		 }
    	 }
    	 System.out.println();
     }
	
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting year... ");
		int s=sc.nextInt();
		System.out.println("Enter ending year... ");
		int e=sc.nextInt();
		print(s,e);
		}
		
	}

}
