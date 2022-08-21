package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;
import static com.techelevator.ui.UserOutput.displayHomeScreen;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    private UserInput userInput = new UserInput();

    public void run() {
        while (true) {
            displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            //System.out.println(choice);
            if (choice.equals("yes")) {
                System.out.println(translateInput(userInput.promptForInput(), morseCodeChart()));
            } else if (choice.equals("no")) {
                // good bye
                break;
            }
        }
        
    }


    public String translateInput(String input, Map<String, String> map) {
        String morseCodeString = "";

        for (int i = 0; i < input.length(); i++) {

                if(map.containsKey(String.valueOf(input.charAt(i)))) {
                    morseCodeString += map.get(String.valueOf(input.charAt(i))) + " ";
                } else if(String.valueOf(input.charAt(i)).equals(" ")) {
                    morseCodeString += " ";
                }
        }
        return morseCodeString;
    }

   /* public static void englishToMorse(String[] code,
                                      String englishLang,
                                      char[] letter)
    {
        System.out.print("Morse code of " + englishLang
                + " is ");
        for (int i = 0; i < englishLang.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (englishLang.charAt(i) == letter[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
    }*/



    public Map<String, String> morseCodeChart() {
        Map<String, String> morseCodeToText = new HashMap<>();
        morseCodeToText.put("a", "._");
        morseCodeToText.put("b", "-...");
        morseCodeToText.put("c", "-.-." );
        morseCodeToText.put("d", "-..");
        morseCodeToText.put("e", ".");
        morseCodeToText.put("f", "..-.");
        morseCodeToText.put("g","--." );
        morseCodeToText.put( "h","....");
        morseCodeToText.put("i", "..");
        morseCodeToText.put("j", ".---");
        morseCodeToText.put("k", "-.-");
        morseCodeToText.put("l", ".-..");
        morseCodeToText.put("m", "--");
        morseCodeToText.put("n", "-.");
        morseCodeToText.put("o", "---");
        morseCodeToText.put("p", ".--.");
        morseCodeToText.put("q", "--.-");
        morseCodeToText.put("r", ".-.");
        morseCodeToText.put("s", "...");
        morseCodeToText.put("t", "-");
        morseCodeToText.put("u", "..-");
        morseCodeToText.put("v", "...-");
        morseCodeToText.put("w", ".--");
        morseCodeToText.put("x", "-..-");
        morseCodeToText.put("y", "-.--");
        morseCodeToText.put("z", "--..");

        return morseCodeToText;
    }

}
