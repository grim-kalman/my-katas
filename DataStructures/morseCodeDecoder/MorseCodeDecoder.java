package dataStructures.morseCodeDecoder;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {

    public static final Map<String, String> MorseCode = new HashMap<>();

    static {
        MorseCode.put(".-", "A");
        MorseCode.put("-...", "B");
        MorseCode.put("-.-.", "C");
        MorseCode.put("-..", "D");
        MorseCode.put(".", "E");
        MorseCode.put("..-.", "F");
        MorseCode.put("--.", "G");
        MorseCode.put("....", "H");
        MorseCode.put("..", "I");
        MorseCode.put(".---", "J");
        MorseCode.put("-.-", "K");
        MorseCode.put(".-..", "L");
        MorseCode.put("--", "M");
        MorseCode.put("-.", "N");
        MorseCode.put("---", "O");
        MorseCode.put(".--.", "P");
        MorseCode.put("--.-", "Q");
        MorseCode.put(".-.", "R");
        MorseCode.put("...", "S");
        MorseCode.put("-", "T");
        MorseCode.put("..-", "U");
        MorseCode.put("...-", "V");
        MorseCode.put(".--", "W");
        MorseCode.put("-..-", "X");
        MorseCode.put("-.--", "Y");
        MorseCode.put("--..", "Z");
    }

    /*
    In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly
    superseded by voice and digital data communication channels, it still has its use in some
    applications around the world.

    The Morse code encodes every character as a sequence of "dots" and "dashes". For example,
    the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−.
    The Morse code is case-insensitive, traditionally capital letters are used. When the message is
    written in Morse code, a single space is used to separate the character codes and 3 spaces is
    used to separate words. For example, the message HEY JUDE in Morse code is:
    ···· · −·−−   ·−−− ··− −·· ·.

    NOTE: Extra spaces before or after the code have no meaning and should be ignored.

    In addition to letters, digits and some punctuation, there are some special service codes,
    the most notorious of those is the international distress signal SOS
    (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated
    as single special characters, and usually are transmitted as separate words.

    Your task is to implement a function that would take the morse code as input and return a
    decoded human-readable string.

    For example:
    ".... . -.--   .--- ..- -.. ." should return "HEY JUDE"
     */
    public static String decode(String morseCode) {

        String[] words = morseCode.trim().split(" {3}");

        StringBuilder decodedMessage = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                decodedMessage.append(MorseCode.get(letter));
            }
            decodedMessage.append(" ");
        }

        return decodedMessage.toString().stripTrailing();
    }

    public static void main(String[] args) {
        System.out.printf(decode(".... . -.--   .--- ..- -.. .")); // Should print HEY JUDE
    }
}