package strings.order;

public class Order {

    /*
    Your task is to sort a given string. Each word in the string will contain a single number. This number is the
    position the word should have in the result.

    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

    If the input string is empty, return an empty string. The words in the input String will only contain valid
    consecutive numbers.
    */
    public static String order(String words) {
        if (words.equals("")) {
            return "";
        }

        String[] wordList = words.split(" ");

        char[] charList;
        String[] sortedWordList = new String[wordList.length];
        for (String word : wordList) {
            charList = word.toCharArray();
            for (char character : charList) {
                if (Character.isDigit(character)) {
                    sortedWordList[Character.getNumericValue(character) - 1] = word;
                    break;
                }
            }
        }
        return String.join(" ", sortedWordList);
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));  // Should return "Thi1s is2 3a T4est"
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));  // Should return "Fo1r the2 g3ood 4of th5e pe6ople"
        System.out.println(order(""));  // Should return ""
    }
}