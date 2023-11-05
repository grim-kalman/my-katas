package math.descendingorder;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {

    /*
    Your task is to make a function that can take any non-negative integer as an argument and
    return it with its digits in descending order. Essentially, rearrange the digits to create
    the highest possible number.

    Examples:
    Input: 42145 Output: 54421
    Input: 145263 Output: 654321
    Input: 123456789 Output: 987654321
    */
    public static int sortDesc(final int num) {
        String[] stringNums = String.valueOf(num).split("");
        String[] sortedNums = Arrays.stream(stringNums)
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);
        return Integer.parseInt(String.join("", sortedNums));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));  // Should return 54421
        System.out.println(sortDesc(145263));  // Should return 654321
        System.out.println(sortDesc(123456789));  // Should return 987654321
    }
}
