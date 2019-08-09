package Introduction;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        // prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = 1;        // initial gcd is 1
        int k = 2;          // possible gcd
        while (k <= n1 && k <=n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;        // update gcd
            k++;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
