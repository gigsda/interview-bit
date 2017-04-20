package test1.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
/////////////
public ArrayList<Integer> preorderTraversal(TreeNode a) {
    Stack<TreeNode> st = new Stack<>();
    ArrayList<Integer> res = new ArrayList<>();

    st.push(a);

    while (!st.isEmpty()){
        TreeNode node = st.pop();

        res.add(node.val);

        if (node.right != null)
            st.push(node.right);

        if (node.left != null)
            st.push(node.left);
    }

    return res;
}

////////////
}

public class PreorderTraversal {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();

        System.out.println(sol);
    }
}
