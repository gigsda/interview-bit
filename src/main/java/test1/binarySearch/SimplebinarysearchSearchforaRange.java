package test1.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
    /////////////
    int gstart = Integer.MAX_VALUE, gend = Integer.MIN_VALUE;

    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {

        if (a.size() != 0)
             recur(a, 0, a.size() - 1, b);

        if (gstart == Integer.MAX_VALUE)
            gstart = gend = -1;
        return new ArrayList<Integer>(Arrays.asList(gstart,gend));
    }

    private void recur(List<Integer> a, int start, int end, int b) {

        if (start > gstart && end < gend) return;

        if (start == end) {
            if (a.get(start) == b) {
                gstart = Math.min(gstart, start);
                gend = Math.max(gend, end);
            }
            return;
        }

        int len = (end - start) / 2;

        if (a.get( start+len) >= b)
            recur(a, start, start+len, b);
        if (a.get(start+len+1) <= b)
            recur(a, start+len+1, end, b);
    }

////////////
}

public class SimplebinarysearchSearchforaRange {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol.searchRange(
                new ArrayList<Integer>(Arrays.asList(10))
        ,10));
    }
}
