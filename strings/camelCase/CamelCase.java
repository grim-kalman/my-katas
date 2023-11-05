public class CamelCase {

    /*
    Complete the method/function so that it converts dash/underscore delimited words into camel casing.
    The first word within the output should be capitalized only if the original word was capitalized
    (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

    Examples:(Input --> Output)
    "the-stealth-warrior" --> "theStealthWarrior"
    "The_Stealth_Warrior" --> "TheStealthWarrior"
    "The_Stealth-Warrior" --> "TheStealthWarrior"
    */
    private static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    static String toCamelCase(String string) {
        String[] delimiters = {"-", "_"};

        for (String delimiter : delimiters) {
            String[] stringArray = string.split(delimiter);
            for (int i = 1; i < stringArray.length; i++) {
                stringArray[i] = capitalize(stringArray[i]);
            }
            string = String.join("", stringArray);
        }

        return string;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));  // Should return "theStealthWarrior"
        System.out.println(toCamelCase("The_Stealth_Warrior"));  // Should return "TheStealthWarrior"
        System.out.println(toCamelCase("The_Stealth-Warrior"));  // Should return "TheStealthWarrior"
    }
}