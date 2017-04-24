package test1.math;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution6 {
/////////////
public int reverse(int a) {
    int t=a;
    long rev=0;

    while (t  != 0){

        if (rev*10 + t%10 > Integer.MAX_VALUE) return 0;
        if (rev*10 + t%10 < Integer.MIN_VALUE) return 0;

        rev = rev*10 + t%10;
        t/=10;
    }
    return (int)rev;
}

////////////
}

public class DigitopReverseinteger {
    public static void main(String[] arg) {
        Solution6 sol = new Solution6();

        System.out.println(sol.reverse(-123));
    }
}
