package question1;

import java.util.Scanner;

/**
 *
 * @author Sufiyan Mohammad
 */
public class Question1 {

    public static void main(String[] args) {
        //declaring the variables.
        double travelDistance;
        double avgDistance;
        double priceLiter = 1.16;

        //Calling in the Scanner and declaring it.
        Scanner console = new Scanner(System.in);

        //Creating the user input.
        System.out.print("How many kilometers will you travel?: ");
        travelDistance = console.nextDouble();
        System.out.print("What is the average distance per liter?: ");
        avgDistance = console.nextDouble();

        //The calculations for estimated cost.
        double literUsed = travelDistance / avgDistance;
        double totalCost = literUsed * priceLiter;

        //Format printing and only display 2 decimals numbers.
        System.out.printf("The cost of the trip will be: %.2f", totalCost);

    }

}
