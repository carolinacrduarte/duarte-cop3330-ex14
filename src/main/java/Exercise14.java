/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 *
 */

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        double order;

        Scanner scan = new Scanner(System.in); //Double scanner to read order amount.
        System.out.print("What is the order amount? ");
        order = scan.nextDouble();

        Scanner input = new Scanner(System.in);
        System.out.print("What is the state? ");
        String state = input.nextLine(); //String scanner to read state.

        double tax = 5.5/10;
        double total;

        //Displaying & calculating total for WI residents:
        if(state.equalsIgnoreCase("WI")) {

            total = order + tax;

            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", order, tax, total);
        } else {

            //Displaying for non-residents:
            System.out.printf("The total is $%.2f.", order);
        }
        input.close();
    }
}
