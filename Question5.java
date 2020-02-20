package question5;

import java.lang.*;
import java.util.Random;

/**
 *
 * @author Sufiyan Mohammad
 */
public class Question5 {

    public static void main(String[] args) {
        // Random number will be generated here.
        Random r = new Random();
        int number = r.nextInt((100 - 0) + 1) + 0;

        System.out.println("The random number is :" + number);
        System.out.println("The number " + number + " to the power of 2");
        System.out.println(Math.pow(number, 2));
        System.out.println("The number" + number + " to the power of 3");
        System.out.println(Math.pow(number, 3));
        System.out.println("The number " + number + " square rooted");
        System.out.println(Math.sqrt(number));
        System.out.println("The number " + number + " in natural log");
        System.out.println(Math.log(number));
        System.out.println("The number " + number + " in log base 10");
        System.out.println(Math.log10(number));
        //I wanted to format print it but I wanted to finish this as quick as 
        //possible.
    }

}
