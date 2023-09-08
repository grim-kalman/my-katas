public class Main {

    /*
    Some numbers have funny properties. For example:

    89 --> 8¹ + 9² = 89 * 1

    695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2

    46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

    Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p

    we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
    In other words:

    Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k

    If it is the case we will return k, if not return -1.

    Note: n and p will always be given as strictly positive integers.
     */
    public static long digPow (int n, int p){

        String stringNumber = String.valueOf(n);

        int sumOfPow = 0;
        for (int index = 0; index < stringNumber.length(); index++) {
            sumOfPow += Math.pow(Character.getNumericValue(stringNumber.charAt(index)), p + index);
        }

        if (sumOfPow % n == 0) {
            long result = sumOfPow / n;
            return result;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {

    }
}