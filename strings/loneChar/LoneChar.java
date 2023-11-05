package strings.loneChar;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LoneChar {

    /*
    Complete the function which accepts a string and return an array of character(s) that have the
    most spaces to their right and left.

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
        int forwardCount = 0;
        int backwardCount = 0;
        Map<String, Integer> characterSpaces = new LinkedHashMap<>();
        for (int i = 0; i < trimmedStringArray.length; i++) {
            if (trimmedStringArray[i].matches("[a-z]")) {
                for (int j = i + 1; j < trimmedStringArray.length && trimmedStringArray[j].equals(" "); j++) {
                    forwardCount++;
                }
                for (int j = i - 1; j >= 0 && trimmedStringArray[j].equals(" "); j--) {
                    backwardCount++;
                }
                characterSpaces.put(trimmedStringArray[i], forwardCount + backwardCount);
                forwardCount = 0;
                backwardCount = 0;
            }
        }
        int max = Collections.max(characterSpaces.values());
        return characterSpaces.entrySet().stream()
                .filter(c -> c.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining())
                .toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(loneliest("a b  c")); // Should return "b"
        System.out.println(loneliest("a bcs           d k")); // Should return "d"
        System.out.println(loneliest("     a  b  c de        ")); // Should return "b"
        System.out.println(loneliest("'     meg      j b    n           d    ka  i f   c hl   '")); // Should return "nd"
    }
}