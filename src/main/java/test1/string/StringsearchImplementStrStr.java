package test1.string;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
/////////////


////////////

    public int strStr(final String haystack, final String needle) {

        if (haystack.length() == 0 || needle.length() == 0)
            return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int k = 0;
            for (; k < needle.length(); k++) {
                if (haystack.charAt(i + k) != needle.charAt(k))
                    break;
            }
            if (k == needle.length())
                return i;
        }

        return -1;
    }
}
public class StringsearchImplementStrStr {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();

        System.out.println(sol.strStr("effef", "effef"));
        System.out.println(sol.strStr("effef  ", "effef"));
        System.out.println(sol.strStr("  effef", "effef"));
        System.out.println(sol.strStr("", "effef"));
        System.out.println(sol.strStr("  effef", ""));
        System.out.println(sol.strStr("", ""));
        System.out.println(sol.strStr("fjeivnsdk sdjfeffefaef jasiofdsaj  jasdfjklasdf", "effef"));
    }
}
