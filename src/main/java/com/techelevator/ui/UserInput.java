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
        if (option.equals("y")) {
            return "yes";
        } else if (option.equals("n")) {
            return "no";
        } else {
            return "";
        }
    }

    public static String promptForInput() {
        System.out.println("     ------ MORSE CODE CONVERTER ------");
        System.out.println("Please enter a word or sentence to be converted");

        String inputString = scanner.nextLine();

//        String[] wordsArray = inputString.split(" ");



        return inputString;
    }

}
