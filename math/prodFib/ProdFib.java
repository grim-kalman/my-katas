package math.prodFib;

import java.util.Arrays;

public class ProdFib {
    /*
    Given the series of Fibonacci numbers (Fn) defined by the integer sequence:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

    Where:
    F(n) = F(n-1) + F(n-2) with initial conditions F(0) = 0 and F(1) = 1.

    Write a function, say productFib, that takes an integer (prod), representing a product,
    and finds two consecutive Fibonacci numbers, F(n) and F(n+1), such that:
    F(n) * F(n+1) = prod.

    Your function should return an array, tuple, or any language-appropriate collection in the
    format:
    [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)

    If no such consecutive Fibonacci numbers are found such that F(n) * F(n+1) = prod,
    then the function should return:
    [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)

    F(n) should be the smallest number such that F(n) * F(n+1) > prod.

    Examples: (Input --> Output)
    714 --> [21, 34, true]
    800 --> [34, 55, false]
    */
    public static long[] productFib(long prod) {
        long fibProd = 0;
        long[] fibNums = new long[]{0, 1, 0};
        while (fibProd < prod) {
            fibNums[2] = fibNums[1];
            fibNums[1] += fibNums[0];
            fibNums[0] = fibNums[2];
            fibProd = fibNums[0] * fibNums[1];
        }
        if (fibProd == prod) {
            fibNums[2] = 1;
        } else {
            fibNums[2] = 0;
        }
        return fibNums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(714))); // Should print [21, 34, 1]
        System.out.println(Arrays.toString(productFib(800))); // Should print [34, 55, 0]
    }
}
