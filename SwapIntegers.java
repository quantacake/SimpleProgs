import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwapIntegers {


    public static String swapIntegers(String string) {

        String tempString;
        int index = -1;

        for(int i = 0; i < string.length(); i++) {

            tempString = string.substring(i, i + 1);
            if (tempString.matches("\\d")) {

                // if index > -1, then this is the second pass and both integers are found
                if (index > -1) {

                    // separate string at the two indexes and swap index values
                    string = (string.substring(0, (index)) +
                            string.charAt(i) +
                            string.substring((index+1), (i)) +
                            string.charAt(index) +
                            string.substring((i+1)));
                }
                index = i;
            }
        }
        return string;
    }

    public static void main(String[] args) {

        System.out.println(swapIntegers("over t1e woods and 2 through the river"));

    }
}
