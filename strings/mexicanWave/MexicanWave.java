package strings.mexicanWave;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MexicanWave {

    /*
    In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
    You will be passed a string, and you must return that string in an array where an uppercase
    letter is a person standing up.

    Rules:
    1.  The input string will always be lower case but maybe empty.
    2.  If the character in the string is whitespace then pass over it as if it was an empty seat


    Example:(Input --> Output)
    wave("hello") --> {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
    */
    public static String[] wave(String string) {
        List<String> stringList = Collections.nCopies(string.length(), string);
        AtomicInteger index = new AtomicInteger();
        return stringList.stream()
                .map(str ->
                        str.substring(0, index.get())
                                + str.substring(index.get(), index.get() + 1).toUpperCase()
                                + str.substring(index.getAndIncrement() + 1))
                .filter(str -> !str.equals(str.toLowerCase()))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("hello"))); // Should return {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
        System.out.println(Arrays.toString(wave("hello world!")));  // Should return {"Hello world!" ... "hello world!", "hello World!" etc.}
    }
}
