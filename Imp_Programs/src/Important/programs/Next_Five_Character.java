package Important.programs;

//input: W   output: WXYZa
//input: x   output: xyzAB

import java.util.Scanner;

public class Next_Five_Character {
	public static void nextFiveCharacter(char ch) 
	{
		for (int i = 1; i <= 5; i++)
		{

			
			if (ch > 'z') {
				ch = 'A';
			} 
			else if (ch > 'Z' && ch < 'a') {
				ch = 'a';
			}

			System.out.print(ch);
			ch++;
		}
		System.out.println(); 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter Any Character: ");
			char ch = sc.next().charAt(0);
			nextFiveCharacter(ch);
		}
	}
}
