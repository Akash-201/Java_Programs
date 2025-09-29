package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        String nStr = sc.nextLine();   // take input
        sc.close();

        BigInteger n = new BigInteger(nStr);

        if (n.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}