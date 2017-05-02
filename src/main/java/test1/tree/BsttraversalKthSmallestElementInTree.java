package test1.tree;

import test1.TreeNode;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution12 {
    /////////////
    int val = -1;
    int cnt = 0;

    public int kthsmallest(TreeNode root, int k) {
        recur(root, k);
        return val;
    }

    private void recur(TreeNode root, int k) {

        if (root == null) return;

        if (root.left != null)
            recur(root.left, k);

        if(val != -1)return;

        cnt++;
        if (cnt == k)
            val = root.val;
        if (root.right != null)
            recur(root.right, k);

        if(val != -1)return;


    }

////////////
}

public class BsttraversalKthSmallestElementInTree {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol);
    }
}
