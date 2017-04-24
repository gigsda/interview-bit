package test1.math;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution5 {
/////////////
public int titleToNumber(String a) {


        int sum = 0;

        for (int i = 0;i < a.length();i ++){

            if(i != 0)
                sum *= 26;
            sum += a.charAt(i)-'A'+1;
        }
        return sum;
    }


////////////
}

public class BaseconversionExcelColumnNumber {
    public static void main(String[] arg) {
        Solution5 sol = new Solution5();

        System.out.println(sol.titleToNumber(""));
        System.out.println(sol.titleToNumber("A"));
        System.out.println(sol.titleToNumber("Z"));
        System.out.println(sol.titleToNumber("AA"));
        System.out.println(sol.titleToNumber("ZZ"));
    }
}
