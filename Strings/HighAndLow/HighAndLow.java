import java.util.Arrays;

public class HighAndLow {

    /*
    In this little assignment you are given a string of space separated numbers, and have to return the
    highest and lowest number.

    Examples:(Input --> Output)
    "1 2 3 4 5"  --> "5 1"
    "1 2 -3 4 5" --> "5 -3"
    "1 9 3 4 -5" --> "9 -5"

    Notes:
    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.
    */
    public static String highAndLow(String numbers) {
        String[] numberStringArray = numbers.split(" ");

        int[] numbersArray = new int[numberStringArray.length];
        for (int i = 0; i < numberStringArray.length; i++) {
            numbersArray[i] = Integer.parseInt(numberStringArray[i]);
        }

        Arrays.sort(numbersArray);

        return Integer.toString(numbersArray[numbersArray.length - 1]) + " " + Integer.toString(numbersArray[0]);
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));  // Should return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));  // Should return "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));  // Should return "9 -5"
    }
}