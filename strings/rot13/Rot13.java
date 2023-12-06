package strings.rot13;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Rot13 {
    static String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static String output = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm";
    static Map<Character, Character> lookupTable = new HashMap<>();

    static {
        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            char outputChar = output.charAt(i);
            lookupTable.put(inputChar, outputChar);
        }
    }

        public static String rot13(String message) {
            return Arrays.stream(message.split(""))
                    .map(c -> {
                        if (c.matches("[A-Za-z]")) {
                            return lookupTable.get(c.charAt(0)).toString();
                        }
                        return c;
                    })
                    .collect(Collectors.joining());
        }

        public static void main(String[] args) {
            System.out.println(rot13("EBG13 rknzcyr.")); // Should return "ROT13 example."
        }
    }
