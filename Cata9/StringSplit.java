public class StringSplit {

    /*
    Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd
    number of characters then it should replace the missing second character of the final pair with an underscore ('_').

    Examples:

    * 'abc' =>  ['ab', 'c_']
    * 'abcdef' => ['ab', 'cd', 'ef']
    */
    public static String[] solution(String s) {

        String[] stringArray = s.split("");
        int stringLength = s.length();

        String[] stringOutputArray;
        if ((stringLength & 1) == 0) {
            stringOutputArray = new String[stringLength/2];
        } else {
            stringOutputArray = new String[stringLength/2 + 1];
        }

        int j = 0;
        for (int i = 0; i < stringLength; i += 2) {
            if (j == stringLength/2) {
                stringOutputArray[j] = stringArray[i] + "_";
                return stringOutputArray;
            }
            stringOutputArray[j] = stringArray[i] + stringArray[i + 1];
            j++;
        }

        return stringOutputArray;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String[] output = solution(s);
        for (String word: output) {
            System.out.println(word);
        }
        s = "abcdef";
        output = solution(s);
        for (String word: output) {
            System.out.println(word);
        }
    }
}