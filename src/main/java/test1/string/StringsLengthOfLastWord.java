package test1.string;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class StringsLengthOfLastWord {
    public static int lengthOfLastWord(final String a) {
        int size = 0;
        int f = 0;
        int l = 0;


        while (l < a.length()) {
            for (; f < a.length(); f++) {
                if (a.charAt(f) != ' ')
                    break;
            }

            if (f >= a.length()) break;

            l = f + 1;
            for (; l < a.length(); l++) {
                if (a.charAt(l) == ' ')
                    break;
            }
            if (l - f > 0)
                size = l - f;
            f = l+1;
        }
        return size;
    }
    public static void main(String [ ] arg) {
        System.out.println(lengthOfLastWord("abc de f   32"));
        System.out.println(lengthOfLastWord(" abc d   "));
        System.out.println(lengthOfLastWord(" abc d"));
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
