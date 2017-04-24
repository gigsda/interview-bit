package test1.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
    /////////////
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        if (k > n)
            return a;

        recur(n, 0, k,new Stack<Integer>(), a);
        return a;
    }


    private void recur(int n,int last, int k, Stack<Integer> sel,ArrayList<ArrayList<Integer>> a) {

        if (k == 0) {
            a.add(new ArrayList<Integer>(sel));
            return;
        }

        for (int i = last+1; i <= n; i++) {
            sel.push(i);
            recur(n,i, k - 1, sel,a);
            sel.pop();

        }
    }

////////////
}

public class SubsetsCombinations {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol.combine(4,1));
    }
}
