import java.util.Arrays;
import java.util.stream.IntStream;

public class CountingDuplicates {

    /*
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
     */
    public static int duplicateCount(String text) {
        String lowerCaseText = text.toLowerCase();

        int count = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            char finalLetter = letter;
            long numberOfOccurrence = lowerCaseText.chars().filter(character ->
                    character == finalLetter).count();
            if (numberOfOccurrence > 1) {
                count++;
            }
        }

        for (int digit = 0; digit < 10; digit++) {
            int finalDigit = digit;
            long numberOfOccurrence = lowerCaseText.chars().filter(character ->
                    character == finalDigit).count();
            if (numberOfOccurrence > 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("abcde"));
    }
}