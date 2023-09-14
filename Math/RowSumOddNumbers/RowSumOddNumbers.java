public class RowSumOddNumbers {

    /*
    Given the triangle of consecutive odd numbers:

                 1
              3     5
           7     9    11
       13    15    17    19
    21    23    25    27    29
    ...

    Calculate the sum of the numbers in the n:th row of this triangle (starting at index 1)

    Examples:(Input --> Output)
    1 -->  1
    2 --> 3 + 5 = 8
    */
    public static int rowSumOddNumbers(int n) {
        // Calculate the first number in the n:th row using the formula n^2 - (n - 1)
        int firstNumberInRow = (int) Math.pow(n, 2) - (n - 1);
        int sum = firstNumberInRow;

        // Iterate through the row to find the sum
        for (int i = 1, nextNumberInRow = firstNumberInRow + 2; i < n; i++, nextNumberInRow += 2) {
            sum += nextNumberInRow;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));  // Should return 1
        System.out.println(rowSumOddNumbers(2));  // Should return 8
        System.out.println(rowSumOddNumbers(3));  // Should return 27
    }
}