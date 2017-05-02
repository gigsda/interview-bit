package test1.tree;

import test1.TreeNode;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution7 {
/////////////


    public int minDepth(TreeNode a) {

        if (a == null)
            return 0;
        return recur(a, 1);
    }

    private int recur(TreeNode a, int level) {
        if (a == null)
            return Integer.MAX_VALUE;

        if (a.right == null && a.left == null)
            return level;

        return Math.min(recur(a.left, level + 1), recur(a.right, level + 1));
    }


}

public class RoottoleafMinDepthofBinaryTree {
    public static void main(String[] arg) {
        Solution7 sol = new Solution7();

        System.out.println(sol);
    }
}
