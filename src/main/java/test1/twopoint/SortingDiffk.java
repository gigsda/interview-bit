package test1.twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
/////////////
public int diffPossible(ArrayList<Integer> a, int b) {
    a.sort(Comparator.naturalOrder());

    for(int i = 0;i < a.size()-1; i++){
        for(int j = i+1;j < a.size(); j++) {
            if (Math.abs(a.get(i) - a.get(j)) == b) return 1;
            if (Math.abs(a.get(i) - a.get(j)) > b)continue;
        }
    }
    return 0;
}

////////////
}

public class SortingDiffk {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();
        System.out.println(sol.diffPossible(new ArrayList<>(Arrays.asList(1,2,3)),0));
        System.out.println(sol.diffPossible(new ArrayList<>(Arrays.asList(3, 5, 6, 7, 13, 13, 16, 17, 21, 32, 34, 39, 40, 42, 48, 49, 52, 60, 66, 66, 67, 71, 73, 78, 80, 85, 94, 94, 95, 97, 100)),49));
    }
}
