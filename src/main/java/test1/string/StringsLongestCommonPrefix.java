package test1.string;

import java.util.ArrayList;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class StringsLongestCommonPrefix {
    public static String  longestCommonPrefix(ArrayList<String> a) {
        int maxn = 100;
        int f = 0;
        int l = a.size();
        for (int i = 0;i < a.size(); i++)
            if((a.get(i)).length() < maxn)
                maxn = (a.get(i)).length();

        int i = 0;
        for ( i = 0;i < maxn; i++){

            char c = (a.get(0)).charAt(i);

            for (int k = 1;k < l; k++)
                if((a.get(k)).charAt(i) != c) {

                    f = 1;
                    break;
                }
                if (f == 1)break;
        }

        return (a.get(0)).substring(0,i);
    }

    public static void main(String [ ] arg) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abcdefgh");
        list.add("aefghijk");
        list.add("abcefgh");

        System.out.println(longestCommonPrefix(list));
    }
}
