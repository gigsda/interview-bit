package test1.tree;

import test1.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution5 {
/////////////

    public int isSymmetric(TreeNode a) {
        Stack<TreeNode> st = new Stack<>();
        Queue<Integer> res1 = new LinkedList<>();

        st.push(a);

        while (!st.isEmpty()) {
            TreeNode node = st.pop();

            res1.add(node.val);

            if (node.left != null)
                st.push(node.left);

            if (node.right != null)
                st.push(node.right);
        }

        st.push(a);

        while (!st.isEmpty()) {
            TreeNode node = st.pop();

            if (res1.poll() != node.val)
                return 0;

            if (node.right != null)
                st.push(node.right);

            if (node.left != null)
                st.push(node.left);
        }

        return 1;
    }

////////////
}

public class SymmetricBinaryTreeBookmarkSuggestEdit {
    public static void main(String[] arg) {
        Solution5 sol = new Solution5();

        System.out.println(sol);
    }
}
