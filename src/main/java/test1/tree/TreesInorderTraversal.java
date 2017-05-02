package test1.tree;

import test1.TreeNode;
import test1.TreePrinter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution13 {
    /////////////
    public ArrayList<Integer> inorderTraversal(TreeNode a) {

        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> anser = new ArrayList<>();
        HashSet<TreeNode> check = new HashSet<>();

        st.push(a);
        TreeNode node = st.peek();

        while (!st.empty()) {
            // if(node.right != null) st.push(node.right);
            node = st.peek();
            if (node.left != null && !check.contains(node.left)) {
                while (node.left != null) {
                    st.push(node.left);
                    node = node.left;
                }
            }
            node = st.pop();
            anser.add(node.val);
            check.add(node);

            if (node.right != null && !check.contains(node.right))
                st.push(node.right);
        }
        return anser;
    }

////////////
}

public class TreesInorderTraversal {
    public static void main(String[] arg) {
        Solution13 sol = new Solution13();
        TreeNode a1 = new TreeNode(10);
        TreeNode a2 = new TreeNode(6);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(3);
        TreeNode a5 = new TreeNode(8);
        TreeNode a6 = new TreeNode(11);
        TreeNode a7 = new TreeNode(17);
        TreeNode a8 = new TreeNode(20);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;
        a6.left = a8;
        TreePrinter.print(a1);
        System.out.println(sol.inorderTraversal(a1));
    }
}
