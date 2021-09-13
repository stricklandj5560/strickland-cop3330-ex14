import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    final static double wiTaxRate = 0.055;
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("What is the order amount? ");
            double orderAmt = scan.nextDouble();
            System.out.print("What is the state? ");
            String state = scan.next().toLowerCase().trim();
            double wiTaxOrd = (double) Math.round(100 * (orderAmt * wiTaxRate)) / 100;
            double wiTotal = wiTaxOrd + orderAmt;
            // use inline boolean statement to keep output to one line.
            System.out.println(
                            (state.equals("wi"))
                                    ?
                                    String.format("The subtotal is $%s.\nThe tax is $%s.\nThe total is $%s.",
                                            orderAmt,
                                            wiTaxOrd,
                                            wiTotal)
                                    :
                                    "The total is $" + orderAmt
                            );
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
