package question2;

import java.util.Scanner;



/**
 * Calculate the price of an item with discount and tax.
 *
 * @author Sufiyan Mohammad
 */
public class Question2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Ask user for the item price.
        System.out.print("Please enter the item price: ");
        double itemPrice = console.nextDouble();

        //Declaring the tax variables.
        double federalTaxRatio = 0.05;
        double provincialTaxRatio = 0.0975;

        //Ask the user for the discount ratio.
        //You said we could be creative so I replaced the tips with discount.
        System.out.print("Please enter the discount ratio: ");
        double discountRatio = console.nextDouble();

        //Calculating the price with the discount
        double discountPrice;
        discountPrice = (itemPrice - (discountRatio * 0.01 * itemPrice));

        //Calculate the discount price and adding tax.
        double federalTax = discountPrice * federalTaxRatio;
        double provincialTax = discountPrice * provincialTaxRatio;
        double totalTax = federalTax + provincialTax;
        double finalPrice;
        finalPrice = discountPrice + totalTax;

        //Creating the space between the inputs and outputs.
        System.out.println("");
        System.out.println("");

        //Printing the original price.
        System.out.printf("Original Price   : %.2f\n", itemPrice);

        //Printing the discount ratio.
        System.out.printf("Discount ratio    : %.2f\n", discountRatio);

        //Printing the price before tax.
        System.out.printf("Price Before Tax  : %.2f\n", discountPrice);
        System.out.println("----------------------------");

        //Printing the value of the federal tax.
        System.out.printf("Federal Tax       : %.2f\n", federalTax);

        //Printing the value of the provincial tax.
        System.out.printf("Provincial Tax    : %.2f\n", provincialTax);

        //Printing the value of final price.
        System.out.printf("Final Price       : %.2f\n", finalPrice);

    }
}
