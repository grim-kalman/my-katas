package Strings.ValidParenthesis;

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
        if (s.isEmpty()) {
            return true;
        } else if (s.length() % 2 != 0) {
            return false;
        }

        while (s.isEmpty() != true) {
            boolean foundPair = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (
                        (s.charAt(i) == '(' && s.charAt(i + 1) == ')') ||
                        (s.charAt(i) == '[' && s.charAt(i + 1) == ']') ||
                        (s.charAt(i) == '{' && s.charAt(i + 1) == '}')
                ) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    foundPair = true;
                    break;
                }
            }
            if (foundPair != true) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidParenthesis validator = new ValidParenthesis();

        System.out.println("Test Case 1: " + validator.isValid("")); // Should return true
        System.out.println("Test Case 2: " + validator.isValid("()")); // Should return true
        System.out.println("Test Case 3: " + validator.isValid("(}")); // Should return false
        System.out.println("Test Case 4: " + validator.isValid("()[]{}")); // Should return true
        System.out.println("Test Case 5: " + validator.isValid("([)]")); // Should return false
        System.out.println("Test Case 6: " + validator.isValid("(((()))){}[]")); // Should return true
        System.out.println("Test Case 7: " + validator.isValid("(((()))){}[")); // Should return false
        System.out.println("Test Case 8: " + validator.isValid("{[()]}")); // Should return true
        System.out.println("Test Case 9: " + validator.isValid("{[()]()}")); // Should return true
        System.out.println("Test Case 10: " + validator.isValid("{[()]}{")); // Should return false
    }
}
