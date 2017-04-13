package test1.string;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution9 {
/////////////
public String reverseWords(String a) {
    a.trim();

    char res[] = new char[a.length()];
    int k = 0;
    int stats = 1;
    String re = "";

    for (int i = 0;i < a.length(); i++){

        if (a.charAt(i) == ' ' &&stats == 0) {
            continue;
        }
        if (a.charAt(i) == ' ' &&stats == 1){

            re = new StringBuilder(new String(res).substring(0,k).trim()).toString()+' '+re;
            stats = 0;
            k=0;
            continue;
        }

        if (a.charAt(i) != ' ')
            res[k++] = a.charAt(i);

        stats = 1;

    }
    if (k > 0)
        re = new StringBuilder(new String(res).substring(0,k).trim()).toString()+' '+re;


    return new String(re).trim();
}

////////////
}

public class WordsReversetheString {
    public static void main(String[] arg) {
        Solution9 sol = new Solution9();
        System.out.println(sol.reverseWords(""));
        System.out.println(sol.reverseWords("bl12"));

        System.out.println(sol.reverseWords("the sky is blue"));
        System.out.println(sol.reverseWords("the sky is blue  "));
        System.out.println(sol.reverseWords("  the  sky is    blue"));
    }
}
