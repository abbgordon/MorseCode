package com.techelevator.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption() {
        System.out.println("Are you ready to get started?");
        System.out.println();

        System.out.println("Y) Yes");
        System.out.println("N) No");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        //System.out.println("option = " + option);
        if (option.equalsIgnoreCase("y")) {
            return "yes";
        } else if (option.equalsIgnoreCase("n")) {
            return "no";
        } else {
            return "";
        }
    }

    public static String displaySubScreen() {
        System.out.println("Would you like to enter something else?");
        System.out.println();

        System.out.println("Y) Yes");
        System.out.println("N) No");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        //System.out.println("option = " + option);
        if (option.equalsIgnoreCase("y")) {
            return "yes";
        } else if (option.equalsIgnoreCase("n")) {
            return "no";
        } else {
            return "";
        }
    }

    public static String promptForInput() {
        System.out.println();
        System.out.println("     ------ MORSE CODE CONVERTER ------");
        System.out.println("Please enter a word or sentence to be converted");

        String inputString = scanner.nextLine();




        return inputString.toLowerCase();
    }

}
