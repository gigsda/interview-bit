package test1.tree;

import test1.TreeNode;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution8 {
/////////////
public int hasPathSum(TreeNode a, int b) {

    return recur(a,b);
}

    private int recur(TreeNode a, int b) {

        if (a == null) return 0;

        b -= a.val;
        if (b == 0 && a.left == null && a.right == null)
            return 1;

        if (recur(a.left,b) == 1)return 1;
        if (recur(a.right,b) == 1)return 1;

        return 0;
    }

////////////
}

public class RoottoleafPathSum {
    public static void main(String[] arg) {
        Solution8 sol = new Solution8();

        System.out.println(sol);
    }
}
