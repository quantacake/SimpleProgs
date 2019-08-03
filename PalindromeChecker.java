public class PalindromeChecker {


    public static boolean check1(String word) {

        for(int i = 0, j = word.length()-1; i < 1+word.length()/2; i++, j--) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;

    }


    public static boolean check2(String word) {

        int wordSize = 1 + word.length() / 2;

        for(int i = 0; i < wordSize; i++) {

            System.out.println(word);
            if(word.length() < 2) {
                return true;
            }

            else if(word.charAt(0) == word.charAt(word.length()-1)) {

                word = word.substring(1, word.length()-1);
            }
        }


        return false;
    }

    public static void main(String[] args) {

        System.out.println(check1("racecar"));


    }
}
