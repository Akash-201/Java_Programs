package HackerRank;

import java.util.Scanner;

public class JavaStaticInitializerBlock 
{
	static int breadth;
	static int height;
	static boolean isValid = true;

	static {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter breadth: ");
		breadth = sc.nextInt();
		System.out.print("Enter height: ");
		height = sc.nextInt();
		sc.close();

		if (breadth <= 0 || height <= 0) {
			isValid = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (isValid) {
			int area = breadth * height;
			System.out.println(area);
		}
	}

}
