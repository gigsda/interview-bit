package test1.math;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
    /////////////
    public int trailingZeroes(int a) {
        long k = 1L;
        int cnt = 0;

        for (int i = 1; i <= a; i++) {
            k *= i;

            while (k % 10 == 0) {
                cnt++;
                k /= 10;
            }

            if (k > 100000) {
                long c = (k / 100000) * 100000;
                k -= c;
            }
        }

        return cnt;

    }

////////////
}

public class TrailingZerosinFactorialBookmarkSuggestEdit
{
    public static void main(String [ ] arg) {
         Solution3 sol = new Solution3();
        System.out.println(sol.trailingZeroes(9247));//2307
        //sol.run
    }
}
