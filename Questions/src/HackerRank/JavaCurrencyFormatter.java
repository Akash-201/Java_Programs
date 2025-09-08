package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double payment = scanner.nextDouble();
        scanner.close();

        // US currency
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        // India currency (no predefined Locale, so create one manually)
        Locale indiaLocale = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

        // China currency
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        // France currency
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        // Printing output
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
