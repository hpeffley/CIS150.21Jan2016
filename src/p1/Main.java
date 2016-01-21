package p1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/*
Program to simulate ordering sandwiches at Jimmy John's
Demo Program for CIS 150
Henry Peffley
21Jan2016
Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char option;
        double price = 0;

        System.out.println("Welcome to Jimmy John's\nWhat would you like?");
        do {
            // Prompt user for a Choice
            System.out.println("(H)am");
            System.out.println("(R)oast beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.println("Enter you choice: ");


            //Get the user input adn convert to upper case
            String choice = input.next();
            choice = choice.toUpperCase();

            //Store the first letter in a char
            option = choice.charAt(0);

            // Switch based on the option
            switch (option) {
                //Ham
                case 'H':
                    price += 6.50;
                    break;

                //Roast Beef
                case 'R':
                    price += 6.75;
                    break;

                //Salami
                case 'S':
                    price += 6.25;
                    break;

                //Tuna
                case 'T':
                    price += 5.50;
                    break;

                //done
                case 'D':
                    price += 0;
                    break;

                default:
                    System.out.println("Sorry " + option + " is not available");
                    price += 0;
            }

            System.out.println("You chose: " + choice);
            System.out.println("Cost: $" + price + "0");

        } while (option != 'D');
        System.out.println("Thank you for choosing Jimmy John's");
    }
}
