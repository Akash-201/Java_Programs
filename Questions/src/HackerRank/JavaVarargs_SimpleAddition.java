package HackerRank;

import java.util.Scanner;

class Add 
{
	public void add(int... numbers)
	{
		int sum = 0;
		StringBuilder sb = new StringBuilder();

		for (int num : numbers)
		{
			sum += num;
			sb.append(num).append("+");
		}

		sb.deleteCharAt(sb.length() - 1); // remove last "+"
		sb.append("=").append(sum);

		System.out.println(sb.toString());
	}
}

public class JavaVarargs_SimpleAddition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		sc.close();

		Add ob = new Add();
		ob.add(n1, n2);
		ob.add(n1, n2, n3);
		ob.add(n1, n2, n3, n4, n5);
		ob.add(n1, n2, n3, n4, n5, n6);
	}

}
