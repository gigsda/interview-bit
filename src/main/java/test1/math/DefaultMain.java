package test1.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */

class Solution8 {
    /////////////
    public int hammingDistance(final List<Integer> A) {

        Long a = 1L;
        Long sum = 0L;
        Integer n = A.size();

        for (int i = 0; i < 31; i++) {
            Long cnt = 0L;
            for (Integer num : A) {
                Long res = a & num.longValue();
                if (res != 0)
                    cnt++;
            }

            sum +=  (2L*(cnt * (n - cnt))%1000000007);
            a *= 2;
            sum %= 1000000007;
        }
        return sum.intValue();
    }

////////////1111111111111111111111111111111
}

public class DefaultMain {
    public static void main(String[] arg) {
        Solution8 sol = new Solution8();
        // System.out.println(sol.hammingDistance(new ArrayList<Integer>(Arrays.asList(2))));
        System.out.println(sol.hammingDistance(new ArrayList<Integer>(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE,0))));
        // System.out.println(sol.hammingDistance(new ArrayList<Integer>(Arrays.asList(2,141,3319,14882,44882,145561,2145561))));
    }
}
