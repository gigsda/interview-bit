package test1.greedy;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    /////////////
    public int mice(ArrayList<Integer> a, ArrayList<Integer> b) {
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());
        int max = -1;
        for (int i = 0;i < a.size(); i++){
            max = Math.max(max,Math.abs(a.get(i)-b.get(i)));
        }
        return max;
    }
////////////
}

public class GreedyAssignMiceToHoles {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();

        System.out.println(sol);
    }
}
