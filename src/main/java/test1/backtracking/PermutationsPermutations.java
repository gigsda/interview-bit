package test1.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
/////////////


    private void recur(LinkedList<Integer> remain, Stack<Integer> sel,ArrayList<ArrayList<Integer>> a) {

        if (remain.size() == 0) {
            a.add(new ArrayList<>(sel));
            return;
        }

        for (int i = 0; i < remain.size(); i++) {
            sel.push(remain.get(i));
            remain.remove(i);
            recur(remain, sel,a);
            remain.add(i,sel.peek());
            sel.pop();

        }
    }
public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    recur(new LinkedList(a), new Stack<>(), res);

    return res;
}

////////////
}

public class PermutationsPermutations {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();

        System.out.println(sol.permute(new ArrayList<>(Arrays.asList(1,2))));
    }
}
