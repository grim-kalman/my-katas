package Strings.LoneChar;

import java.util.*;
import java.util.stream.Stream;

public class LoneChar {

    /*
    Complete the function which accepts a string and return an array of character(s) that have the most spaces to their
    right and left.

    Notes:
    the string can have leading/trailing spaces - you should not count them
    the strings contain only unique characters from a to z
    the order of characters in the returned array doesn't matter

    Examples:(Input --> Output)
    "a b  c"                        -->  ["b"]
    "a bcs           d k"           -->  ["d"]
    "    a b  sc     p     t   k"   -->  ["p"]
    "a  b  c  de"                   -->  ["b", "c"]
    "     a  b  c de        "       -->  ["b"]
    "abc"                           -->  ["a", "b", "c"]

    */
    public static char[] loneliest(String string) {
        String[] trimmedStringArray = string.trim().split("");

        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        int previousCount = 0;
        for (String character : trimmedStringArray) {
            if (!character.equals(" ")) {
                result.add(count + previousCount);
                previousCount = count;
                count = 0;
            } else {
                count++;
            }
        }

        System.out.printf(result.toString());
        return new char[0];
    }

    public static void main(String[] args) {
        System.out.println(loneliest("a b  c")); // Should return "b"
        System.out.println(loneliest("a bcs           d k")); // Should return "d"
        System.out.println(loneliest("     a  b  c de        ")); // Should return "b"
    }
}
