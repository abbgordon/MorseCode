package com.techelevator.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String promptForInput() {
        System.out.println("     ------ MORSE CODE CONVERTER ------");
        System.out.println("Please enter a word or sentence to be converted");

        String inputString = scanner.nextLine();

//        String[] wordsArray = inputString.split(" ");



        return inputString;
    }

}
