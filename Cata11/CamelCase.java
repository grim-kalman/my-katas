import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamelCase {
    public static void main(String[] args) {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        System.out.println(CamelCase.toCamelCase(input));
    }
}