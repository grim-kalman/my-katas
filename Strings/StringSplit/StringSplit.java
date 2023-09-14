public class StringSplit {

    /*
    Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd
    number of characters then it should replace the missing second character of the final pair with an underscore ('_').

    Examples:(Input --> Output)
    'abc' --> ['ab', 'c_']
    'abcdef' --> ['ab', 'cd', 'ef']
    */
    public class StringSplit {

        public static String[] solution(String s) {
            int stringLength = s.length();
            int arrayLength = (stringLength % 2 == 0) ? stringLength / 2 : (stringLength / 2) + 1;
            String[] result = new String[arrayLength];

            for (int i = 0, j = 0; i < stringLength; i += 2, j++) {
                StringBuilder pair = new StringBuilder();
                pair.append(s.charAt(i));

                if (i + 1 < stringLength) {
                    pair.append(s.charAt(i + 1));
                } else {
                    pair.append("_");
                }

                result[j] = pair.toString();
            }

            return result;
        }

        public static void main(String[] args) {
            String s = "abcde";
            String[] output = solution(s);
            for (String word : output) {
                System.out.println(word);
            }
            s = "abcdef";
            output = solution(s);
            for (String word : output) {
                System.out.println(word);
            }
        }
    }
}