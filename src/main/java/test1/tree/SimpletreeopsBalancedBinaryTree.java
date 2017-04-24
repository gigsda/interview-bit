package test1.tree;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution10 {
/////////////

    public int isBalanced(TreeNode a) {

        return (recur(a, 0) == -1)?0:1;
    }

    private int recur(TreeNode a, int depth) {

        int leftd=depth,rightd=depth;

        if (a.left != null)
            leftd = recur(a.left, depth + 1);

        if (a.right != null)
            rightd = recur(a.right, depth + 1);

        if (rightd == -1 || leftd == -1)
            return -1;
        if (Math.abs(rightd - leftd) > 1)
            return -1;

        return (leftd > rightd)? leftd: rightd;
    }

////////////
}

public class SimpletreeopsBalancedBinaryTree {
    public static void main(String[] arg) {
        Solution10 sol = new Solution10();
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(1);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(1);
        TreeNode a5 = new TreeNode(1);
        TreeNode a6 = new TreeNode(1);

        a1.left = a2;
        a1.right = a3;
        a3.right = a4;
        a4.right = a5;

        System.out.println(sol.isBalanced(a1));
    }
}
