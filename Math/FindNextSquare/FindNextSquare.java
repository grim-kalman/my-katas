public class FindNextSquare {

    /*
    You might know some pretty large perfect squares. But what about the NEXT one?

    Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
    Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.

    If the parameter is itself not a perfect square then -1 should be returned.
    You may assume the parameter is non-negative.

    Examples:(Input --> Output)
    121 --> 144
    625 --> 676
    114 --> -1 since 114 is not a perfect square
    */
    public static long findNextSquare(long sq) {
        // Check if the input is a perfect square, if so return the next perfect square
        return Math.sqrt(sq) % 1 == 0 ? (long) Math.pow(Math.sqrt(sq) + 1, 2) : -1;
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));  // Should return 144
        System.out.println(findNextSquare(625));  // Should return 676
        System.out.println(findNextSquare(114));  // Should return -1
    }