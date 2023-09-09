public class Main {

    /*
    Given the triangle of consecutive odd numbers:

    1.              1
    2.           3     5
    3.        7     9    11
    4.    13    15    17    19
    5. 21    23    25    27    29
    ...
    Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

    1 -->  1
    2 --> 3 + 5 = 8
     */
    public static int rowSumOddNumbers(int n) {
        int firstNumberInRow = (int) Math.pow(n, 2) - (n - 1); // First number in the n:th row
        int sum = firstNumberInRow;
        for (int i = 1, nextNumberInRow = firstNumberInRow + 2; i<n; i++, nextNumberInRow += 2) {
            sum += nextNumberInRow;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}