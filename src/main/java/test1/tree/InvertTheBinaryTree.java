package test1.tree;

import test1.TreeNode;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
    /////////////
    public TreeNode invertTree(TreeNode root) {
        recur(root);
        return root;
    }

    private void recur(TreeNode a) {

        if (a == null)
            return;

        TreeNode t = a.right;
        a.right = a.left;
        a.left = t;

        recur(a.right);
        recur(a.left);
    }
////////////
}

public class InvertTheBinaryTree {
    public static void main(String[] arg) {
             TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(6);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(7);
        TreeNode a7 = new TreeNode(4);
        TreeNode a8 = new TreeNode(0);
        TreeNode a9 = new TreeNode(8);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a5.left = a6;
        a5.right = a7;
        a3.left = a8;
        a3.right = a9;
        Solution3 sol = new Solution3();

        System.out.println(sol.invertTree(a1));
    }
}
