package test1.backtracking;

import java.util.ArrayList;

/**
 * Created by 1100383 on 2017. 4. 10..
 */
public class BacktrackingGenerateAllParenthesesIi {

    static ArrayList<String> ar = new ArrayList<String>();
    static int n = 0;

    public static int gp(int left, int right, int k, StringBuilder str) {

        if (left < right)
            return 0;

        if (left > n || right > n)
            return 0;

        if (k == n * 2) {
            System.out.println(str.toString());
            return 0;
        }

        str.append('(');
        gp(left + 1, right, k + 1, str);
        str.deleteCharAt(str.length()-1);

        str.append(')');
        gp(left, right + 1, k + 1, str);
        str.deleteCharAt(str.length()-1);

        return 0;
    }


    public static ArrayList<String> generateParenthesis(int a) {

        n = a;

        StringBuilder str = new StringBuilder();

        gp(0, 0, 0, str);

        return ar;
    }

    public static void main(String[] arg) {
        System.out.println(generateParenthesis(4));
    }
}
