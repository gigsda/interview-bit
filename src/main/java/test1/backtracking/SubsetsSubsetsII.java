package test1.backtracking;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    /////////////
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {

        a.sort(Comparator.naturalOrder());
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        recur(new Stack<>(),a, res);
        return res;
    }

    private void recur(Stack<Integer>  sel, List<Integer> a, ArrayList<ArrayList<Integer>> res) {
      //  if (!res.contains(sel))
                res.add(new ArrayList<>(sel));

        int prv = -1;
        for(int i = 0;i < a.size(); i++){
            if (prv == a.get(i))
                continue;
            sel.push(a.get(i));
            prv = a.get(i);
            recur(sel,a.subList(i+1,a.size()),res);
            sel.pop();
        }
    }

////////////
}

public class SubsetsSubsetsII {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();

        System.out.println(sol.subsetsWithDup(new ArrayList<>(Arrays.asList(2,2,2,2))));
    }
}
