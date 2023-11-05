package math.prodFib;

public class ProdFib {
    /*
    Given the series of Fibonacci numbers (Fn) defined by the integer sequence:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

    Where:
    F(n) = F(n-1) + F(n-2) with initial conditions F(0) = 0 and F(1) = 1.

    Write a function, say productFib, that takes an integer (prod), representing a product,
    and finds two consecutive Fibonacci numbers, F(n) and F(n+1), such that:
    F(n) * F(n+1) = prod.

    Your function should return an array, tuple, or any language-appropriate collection in the format:
    [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)

    If no such consecutive Fibonacci numbers are found such that F(n) * F(n+1) = prod,
    then the function should return:
    [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)

    F(n) should be the smallest number such that F(n) * F(n+1) > prod.

    Examples: (Input --> Output)
    productFib(714) --> should return [21, 34, true], {21, 34, 1}, or (21, 34, True) since 714 = 21 * 34

    productFib(800) --> should return [34, 55, false], {34, 55, 0}, or (34, 55, False) since 21 * 34 < 800 < 34 * 55
    */
    public static long[] productFib(long prod) {
        
        return null;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
