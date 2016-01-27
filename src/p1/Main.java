package p1;


import java.util.Scanner;

/*
Program to simulate ordering sandwiches at Jimmy John's
Demo Program for CIS 150
Henry Peffley
21Jan2016
Version 1.0.1
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char option;
        double price = 0, itemAmount, runningTotal = 0;

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

          //  if (choice != )
           // System.out.println("How many of this item would you like?");
          //  double itemAmount = input.nextDouble();



            // Switch based on the option
            switch (option) {
                //Ham
                case 'H':
                    System.out.println("How many of this item would you like?");
                    itemAmount = input.nextDouble();
                    price += 6.50 * itemAmount;
                    runningTotal += price;
                    break;

                //Roast Beef
                case 'R':

                    System.out.println("How many of this item would you like?");
                    itemAmount = input.nextDouble();
                    price += 6.75 * itemAmount;
                    runningTotal += price;
                    break;

                //Salami
                case 'S':
                    System.out.println("How many of this item would you like?");
                    itemAmount = input.nextDouble();
                    price += 6.25 * itemAmount;
                    runningTotal += price;
                    break;

                //Tuna
                case 'T':
                    System.out.println("How many of this item would you like?");
                    itemAmount = input.nextDouble();
                    price += 5.50 * itemAmount;
                    runningTotal += price;
                    break;

                //done
                case 'D':
                    break;

                default:
                    System.out.println("Sorry " + option + " is not available");
                    price += 0;
            }


            System.out.println("You chose: " + choice);
            System.out.println("Your current order total is: $" + runningTotal + "0");

        } while (option != 'D');
        System.out.println("Thank you for choosing Jimmy John's");
    }
}
