import java.util.Arrays;
import java.util.stream.IntStream;

public class CountingDuplicates {

    /*
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
    that occur more than once in the input string. The input string can be assumed to contain only alphabets
    (both uppercase and lowercase) and numeric digits.

    Example:(Input --> Output)
    "abcde" --> 0
    "aabbcde" --> 2
    "aabBcde" --> 2
    "indivisibility" --> 1
    "Indivisibilities" --> 2
    "aA11" --> 2
    "ABBA" --> 2
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
        System.out.println(CountingDuplicates.duplicateCount("abcde")); // Should return 0
        System.out.println(CountingDuplicates.duplicateCount("aabbcde")); // Should return 2
        System.out.println(CountingDuplicates.duplicateCount("aabBcde")); // Should return 2
        System.out.println(CountingDuplicates.duplicateCount("indivisibility")); // Should return 1
        System.out.println(CountingDuplicates.duplicateCount("Indivisibilities")); // Should return 2
        System.out.println(CountingDuplicates.duplicateCount("aA11")); // Should return 2
        System.out.println(CountingDuplicates.duplicateCount("ABBA")); // Should return 2
    }
}