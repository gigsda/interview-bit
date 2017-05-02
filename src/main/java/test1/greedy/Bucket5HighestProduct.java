package test1.greedy;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
    /////////////
    public int maxp3(ArrayList<Integer> a) {
        a.sort(Comparator.naturalOrder());
        int k = a.size()-1;
        int max = Integer.MIN_VALUE;
        //+ - -
        max = Math.max(a.get(k)*a.get(0)*a.get(1), max);
        //+ + +
        max = Math.max(a.get(k-2)*a.get(k-1)*a.get(k), max);
        //- - +         //- + -
        max = Math.max(a.get(0)*a.get(1)*a.get(k), max);

        return max;
    }

    ////////////
}

public class Bucket5HighestProduct {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();

        System.out.println(sol);
    }
}
