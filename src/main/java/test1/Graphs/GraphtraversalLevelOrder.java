package test1.Graphs;


import test1.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 1100383 on 2017. 4. 10..
 */



class Solution {

    public ArrayList<ArrayList<Integer>> levelOrder2(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> level = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (A == null)
            return null;

        queue.add(A);
        queue.add(null);
        TreeNode node;

        while (!queue.isEmpty()) {

            node = queue.remove();

            if (node == null && queue.isEmpty()) {
                res.add(new ArrayList<>(level));
                break;
            }

            if (node == null) {
                res.add(new ArrayList<>(level));
                level.clear();
                queue.add(null);
                continue;
            }

            level.add(node.val);

            if (node.left != null)
                queue.add(node.left);

            if (node.right != null) {
                queue.add(node.right);
            }


        }

        return res;
    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode a) {
        if (a == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        queue.add(a);

        int k = 1;
        while (!queue.isEmpty()) {

            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = 0; i < k; i++) {

                TreeNode node = queue.poll();
                al.add(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);


            }
            res.add(al);
            k = queue.size();
        }
        return res;
    }

}


public class GraphtraversalLevelOrder {
    public static void main(String[] arg) {
        Solution sol = new Solution();
        TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(9);
        TreeNode a3 = new TreeNode(20);
        TreeNode a4 = new TreeNode(15);
        TreeNode a5 = new TreeNode(7);
        a1.left = a2;
        a1.right = a3;
        a3.left = a4;
        a3.right = a5;

        System.out.println(sol.levelOrder2(a1));
    }
}
