package test1.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution9 {
    /////////////
    public ArrayList<Integer> postorderTraversal(TreeNode a) {
        Stack<TreeNode> st = new Stack<>();
        HashSet<TreeNode> lastVisited = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        st.push(a);

        while (!st.isEmpty()) {
            TreeNode node = st.peek();

            while (node.left != null && true != lastVisited.contains(node.left)) {
                st.push(node.left);
                lastVisited.add(node.left);
                node = node.left;
            }

            if (node.right != null  && true != lastVisited.contains(node.right)) {
                st.push(node.right);
                lastVisited.add(node.right);
            } else {
                int val = st.pop().val;
                res.add(val);
            }
        }
        return res;
    }
////////////
}

public class TraversalPostorderTraversal {
    public static void main(String[] arg) {
        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(6);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(8);
        TreeNode a6 = new TreeNode(11);
        TreeNode a7 = new TreeNode(17);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        Solution9 sol = new Solution9();

        System.out.println(sol.postorderTraversal(a1));
    }
}
