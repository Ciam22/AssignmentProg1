package question3;

import java.util.Scanner;

/**
 *
 * @author Sufiyan Mohammad
 */
public class Question3 {

    public static void main(String args[]) {

        int m, n, sum = 0;

        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a 3 digit number: ");

        m = console.nextInt();

        while (m > 0) {

            n = m % 10;

            sum = sum + n;

            m = m / 10;

        }

        System.out.println("Sum of Digits:" + sum);

    }

}
