import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamelCase {

    /*
    Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

    Examples
    "the-stealth-warrior" gets converted to "theStealthWarrior"

    "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

    "The_Stealth-Warrior" gets converted to "TheStealthWarrior"


    */
    static String toCamelCase(String string) {
        String[] stringArray = string.split("-");
        int i = 0;
        for (var s : stringArray) {
            if (s == stringArray[0]) {
                stringArray[i] = s;
            } else {
                stringArray[i] = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
            };
            i++;

        }
        String modifiedString = String.join("", stringArray);

        String[] newStringArray = modifiedString.split("_");
        i = 0;
        for (var s : newStringArray) {
            if (s == newStringArray[0]) {
                newStringArray[i] = s;
            } else {
                newStringArray[i] = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
            }
            i++;
        }

        modifiedString = String.join("", newStringArray);
        return modifiedString;
    }

    public static void main(String[] args) {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        System.out.println(CamelCase.toCamelCase(input));
    }
}