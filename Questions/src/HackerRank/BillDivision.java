package HackerRank;

import java.util.Arrays;
import java.util.List;

public class BillDivision 
{ 
	public static void bonAppetit(List<Integer> bill, int k, int b) 
	{
		int total = 0;

		for (int i = 0; i < bill.size(); i++) {
			total += bill.get(i);
		}

		int annaShare = (total - bill.get(k)) / 2;

		if (annaShare == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - annaShare);

		}
	}
	public static void main(String[] args) {
		List<Integer> bill=Arrays.asList(3,10,2,9);
		int k=1;
		int b=12;
		bonAppetit(bill, k, b);

	}
}
