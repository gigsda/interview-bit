package test1.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */

class Solution3 {
    /////////////
        ArrayList<ArrayList<Integer>> anser;

        public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
            a.sort(Comparator.naturalOrder());
            anser = new ArrayList<>();
            Stack<Integer> set = new Stack<>();
            recur(0, a, b, set);
            return anser;
        }

        private void recur(int i, ArrayList<Integer> a, int b, Stack<Integer> set) {
            if (b == 0) {
                ArrayList<Integer> list = new ArrayList<Integer>(set);
                if (anser.contains(list))
                    return;

                anser.add(list);
                return;

            } else if (a.size() <= i || b < a.get(i))
                return;

            for (int j = i ; j < a.size(); j++) {
                set.push(a.get(j));
                recur(j+1, a, b - a.get(j), set);
                set.pop();
            }
        }

////////////
}

public class SubsetsCombinationSumII {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();

        System.out.println(sol.combinationSum(new ArrayList<>(Arrays.asList(10, 1, 2, 7, 6, 1, 5)), 8));
    }
}
