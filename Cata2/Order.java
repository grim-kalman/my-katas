import java.util.Arrays;

public class Order {

    /*
    Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

    If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
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
                }
            }
        }
        return Arrays.toString(sortedWordList).replace("[", "").replace("]","").replace(",", "");
    }

    public static void main(String[] args) {

    }
}