package test1.backtracking;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution5 {
    /////////////
    ArrayList<ArrayList<Integer>> anser;

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        HashSet<Integer> bag = new HashSet<>(a);

        a.clear();
        a.addAll(bag);

        a.sort(Comparator.naturalOrder());
        anser = new ArrayList<>();

        Stack<Integer> set = new Stack<>();
        recur(0, a, b, set);
        return anser;
    }

    private void recur(int i, ArrayList<Integer> a, int b, Stack<Integer> set) {
        if (b == 0) {
            ArrayList<Integer> list = new ArrayList<Integer>(set);

            anser.add(list);
            return;

        } else if (a.size() <= i || b < a.get(i))
            return;

        for (int j = i; j < a.size(); j++) {
            set.push(a.get(j));
            recur(j , a, b - a.get(j), set);
            set.pop();
        }
    }
////////////
}

public class SubsetsCombinationSum {
    public static void main(String[] arg) {
        Solution5 sol = new Solution5();

        System.out.println(sol.combinationSum(new ArrayList<>(Arrays.asList(8, 10, 6, 11, 1, 16, 8)), 28));
    }
}
