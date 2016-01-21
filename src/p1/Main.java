package p1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/*
Program to simulate ordering sandwiches at Jimmy John's
Demo Program for CIS 150
Henry Peffley
21Jan2016
Version 0.1
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char option;


        System.out.println("Welcome to Jimmy John's\nWhat would you like?");
        do {
            // Prompt user for a Choice
            System.out.println("(H)am");
            System.out.println("(R)oast beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");

            //Get the user input
            String choice = input.next();
            //Store the first letter in a char
            option = choice.charAt(0);

        } while (option != 'D');
        System.out.println("Thank you for choosing Jimmy John's");
    }
}
