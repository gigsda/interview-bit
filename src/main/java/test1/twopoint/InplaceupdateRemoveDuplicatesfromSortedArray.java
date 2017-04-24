package test1.twopoint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution8 {
    /////////////
    public int removeDuplicates(ArrayList<Integer> a) {
        int len = 0;
        int n = a.size();
        for (int i = 1; i < n; i++) {
            if (a.get(i - 1).intValue() != a.get(i)) {
                a.set(len + 1, a.get(i));
                len++;
            }
        }

        for (int i = 0;i < n-len-1; i++)
            a.remove(a.size()-1);
        return a.size();
    }

////////////
}

public class InplaceupdateRemoveDuplicatesfromSortedArray {
    public static void main(String[] arg) {
        Solution8 sol = new Solution8();

        System.out.println(sol.removeDuplicates(new ArrayList<>(Arrays.asList(1))));
        System.out.println(sol.removeDuplicates(new ArrayList<>(Arrays.asList(0))));
    }
}
