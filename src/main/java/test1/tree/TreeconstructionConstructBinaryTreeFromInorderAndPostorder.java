package test1.tree;

import test1.TreeNode;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution14 {
/////////////

    Stack<Integer> st;

    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
        st = new Stack<>();

        for(int i = 0;i < inorder.size(); i++) {
            st.push(inorder.indexOf(postorder.get(i)));
            st.push(postorder.get(i));
        }

        return recur(0, inorder.size());
    }

    private TreeNode recur(int first,int last) {
        if (first == last  ) return null;

        int center = 0;

        TreeNode node = new TreeNode(st.pop());
        center = st.pop();

        node.right = recur(center + 1, last);
        node.left = recur(first, center);

        return node;
    }

////////////
}

public class TreeconstructionConstructBinaryTreeFromInorderAndPostorder {
    public static void main(String[] arg) {
        Solution14 sol = new Solution14();

     //    TreeNode node =  (sol.buildTree(
       //         new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)), new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2, 8, 9, 7, 6))));

        TreeNode node =  (sol.buildTree(
                new ArrayList<>(Arrays.asList(2,1,3)), new ArrayList<>(Arrays.asList(2,3,1))));

        node = null;
    }
}
