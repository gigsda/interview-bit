package test1.tree;

import test1.TreeNode;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    /////////////
    public int isSameTree(TreeNode a, TreeNode b) {
        return recur(a, b);
    }

    public int recur(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return 1;

        if (a == null && b != null)
            return 0;

        if (a != null && b == null)
            return 0;

        if (a.val != b.val)
            return 0;

        if (recur(a.right, b.right) == 0)
            return 0;

        if (recur(a.left, b.left) == 0)
            return 0;

        return 1;
    }

////////////
}

public class twotreesIdenticalBinaryTrees {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();

        TreeNode a1 = new TreeNode(5);
        TreeNode a2 = new TreeNode(10);
        TreeNode a3 = new TreeNode(5);

        a1.left = a2;


        System.out.println(sol.isSameTree(a1,a3));
    }
}
