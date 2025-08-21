package LeetCode_Questions;

//Leetcode : 509. Fibonacci Number

public class FibonacciNumber509 
{
	 public static int fib(int n)
	 {
		 if(n==0) return 0;
		 if(n==1) return 1;
		 int a=0;
		 int b=1;
		 for(int i=2;i<=n;i++)
		 {
			 int c=a+b;
			 a=b;
			 b=c;
		 }
		 return b;
	 }
	 public static void main(String[] args) {
		int n=4;
		System.out.println(fib(4));
	}

}
