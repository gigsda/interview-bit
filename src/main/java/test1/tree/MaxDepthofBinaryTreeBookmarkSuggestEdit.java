package test1.tree;

import test1.TreeNode;

/**
 * Created by 1100383 on 2017. 4. 10..
 */



class Solution {
    /////////////

    public int maxDepth(TreeNode a) {
        return recur(a,0);
    }

    private int recur(TreeNode a, int i) {

        if (a == null)
            return i;

        int r = recur(a.right,i+1);
        int l = recur(a.left,i+1);
        return (r>l)?r:l;
    }

////////////
}

public class MaxDepthofBinaryTreeBookmarkSuggestEdit {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol.maxDepth(null));
    }
}
