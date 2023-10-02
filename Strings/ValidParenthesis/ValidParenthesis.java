package Strings.ValidParenthesis;

import java.util.LinkedList;
import java.util.Queue;

public class ValidParenthesis {


    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if
    the input string is valid.

    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.
     */
    public boolean isValid(String s) {
        // insikt 1: En laglig sträng måste vara jämnt
        // insikt 2: En laglig sträng måste vara jämn efter raderandet av en typ av parantes
        // insikt 3: ( [[ [{}] ]] ), [ ( (){} ) ], ( ([]{}()) ) ->
        // Det finns alltid en mittpunkt av två typer: antingen självstängande eller inte. Om
        // inte så måste omgivande två vara det.

        // Strategi:
        // Börja utifrån och "skala" "löken" innåt så att säga, gör detta tills de två yttersta
        // skalen inte stämmer längre t.ex:
        // ( ([]{}(())) )
        //   ([]{}(()))
        //    []{}(())
        // Rekursivt?...


        // base case: it closes it self

        String[] stringArray = s.split("");
        Queue<String> stringQueue = new LinkedList<>();

        for (int i = 0; i<stringArray.length; i++) {
            
        }
        
        return true;
    }

    public static void main(String[] args) {

    }
}
