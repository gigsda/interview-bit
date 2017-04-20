package test1.string;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution9 {
    /////////////
    public String reverseWords(String a) {
        a.trim();

        List<String> al = Arrays.asList(a.split(" "));
        ListIterator li = al.listIterator(al.size());

        StringBuilder sb = new StringBuilder();
        while (li.hasPrevious()) {
            String x = li.previous().toString();
            if (x.compareTo("") == 0)
                continue;

            sb.append(x + " ");
        }

        return sb.toString().trim();
    }

////////////
}

public class WordsReversetheString {
    public static void main(String[] arg) {
        Solution9 sol = new Solution9();


        System.out.println(sol.reverseWords("  the  sky is    blue   "));
    }
}
