package test1.checkpoint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
    /////////////
    public ArrayList<ArrayList<Integer>> prettyPrint(int n) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (n == 0)
            new ArrayList<Integer>();

        Integer a[] = new Integer[2 * (n - 1) + 1];

        for (int i = 0; i < n; i++) {

            for (int j = i; j < 2 * (n - 1) + 1 - i; j++) {
                a[j] = n - i;
            }
            res.add(new ArrayList<Integer>(Arrays.asList(a)));
        }


        for (int i = n - 2; i >= 0; i--) {

            for (int j = i; j < 2 * (n - 1) + 1 - i; j++) {
                a[j] = n - i;
            }
            res.add(new ArrayList<Integer>(Arrays.asList(a)));
        }

        return res;
    }

////////////
}

public class Prettyprint {
    public static void main(String [ ] arg) {
         Solution sol = new Solution();
         System.out.println(sol.prettyPrint(3));
    }
}
