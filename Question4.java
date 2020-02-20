package question4;

import java.util.Scanner;

/**
 * Verify a URL.
 *
 * @author Sufiyan Mohammad
 */
public class Question4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Asking user to input url
        System.out.print("Please enter a url: ");
        String url = console.next();
        //Making it to lower so its true if user inputs the url in capitals
        url = url.toLowerCase();
        url = url.trim();
        int urlSize = url.length();

        System.out.println("Verifying the URL with " + urlSize + " characters");

        if (url.contains("https://")) {
            System.out.println("Is this a valid and secure URL? true");
        } else {
            System.out.println("Is this a valid and secure URL? false");
        }
    }

}
