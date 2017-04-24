package test1.twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
    /////////////
    public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> res = new ArrayList<>();
        a.sort(Comparator.naturalOrder());
        b.sort(Comparator.naturalOrder());

        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {

            if (a.get(i) > b.get(j))
                j++;
            else if (a.get(i) < b.get(j))
                i++;
            else if (a.get(i).compareTo(b.get(j)) == 0) {
                res.add(a.get(i));
                i++;
                j++;
            }
        }

        return res;
    }

////////////
}

public class MultiplearraysIntersectionOfSortedArrays {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();

        System.out.println(sol.intersect(
                Arrays.asList(10000000)
                , Arrays.asList(10000000)));
        System.out.println(sol.intersect(
                Arrays.asList(1, 2, 3,3,4,5,6)
                , Arrays.asList(3,5)));
        System.out.println(sol.intersect(
                Arrays.asList()
                , Arrays.asList(3,5)));
        System.out.println(sol.intersect(
                Arrays.asList(3,3,3,3,1)
                , Arrays.asList(3,3)));
        System.out.println(sol.intersect(
                Arrays.asList(3)
                , Arrays.asList()));     System.out.println(sol.intersect(
                Arrays.asList()
                , Arrays.asList()));
    }
}
