package com.techelevator.application;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    public Map<String, String> translate() {
        Map<String, String> morseCodeToText = new HashMap<>();
        morseCodeToText.put("._", "a");
        morseCodeToText.put("-...", "b");
        morseCodeToText.put("-.-.", "c");
        morseCodeToText.put("-..", "d");
        morseCodeToText.put(".", "e");
        morseCodeToText.put("..-.", "f");
        morseCodeToText.put("--.", "g");
        morseCodeToText.put("....", "h");
        morseCodeToText.put("..", "i");
        morseCodeToText.put(".---", "j");
        morseCodeToText.put("._.", "k");
        morseCodeToText.put(".-..", "l");
        morseCodeToText.put("--", "m");
        morseCodeToText.put("-.", "n");
        morseCodeToText.put("---", "o");
        morseCodeToText.put(".--.", "p");
        morseCodeToText.put("--.-", "q");
        morseCodeToText.put(".-.", "r");
        morseCodeToText.put("...", "s");
        morseCodeToText.put("-", "t");
        morseCodeToText.put("..-", "u");
        morseCodeToText.put("...-", "v");
        morseCodeToText.put(".--", "w");
        morseCodeToText.put("-..-", "x");
        morseCodeToText.put("-.--", "y");
        morseCodeToText.put("--..", "z");

        return morseCodeToText;
    }

}
