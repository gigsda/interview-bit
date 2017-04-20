package test1.study;

/**
 * Created by 1100383 on 2017. 4. 10..
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    private final static Map<Integer, ArrayList<TreeNode>> CACHE = new HashMap<>();


    public ArrayList<TreeNode> recur(List<Integer> a,int startNum, int endNum) {
        ArrayList<TreeNode> treeList = new ArrayList<TreeNode>();

      //  ArrayList<TreeNode> cachedTreeNodes = getCache(startNum, endNum);
      //  if (cachedTreeNodes != null) {
      //      return cachedTreeNodes;
      //  }

        if (a.size() == 1) {
            treeList.add(new TreeNode(a.get(0)));
            return treeList;
        }

        ArrayList<TreeNode> right;
        ArrayList<TreeNode> left;

        for (int i = 0; i < a.size(); i++) {

            left = recur(a.subList(0, i),0,i);
            right = recur(a.subList(i + 1, a.size()),i+1,a.size());

            if (left.isEmpty()) {

                for (int l = 0; l < right.size(); l++) {
                    TreeNode node = sumTree(a.get(i), null, right.get(l));
                    treeList.add(node);
                }
            } else if (right.isEmpty()) {

                for (int l = 0; l < left.size(); l++) {
                    TreeNode node = sumTree(a.get(i), left.get(l), null);
                    treeList.add(node);
                }
            } else {

                for (int k = 0; k < left.size(); k++) {
                    for (int l = 0; l < right.size(); l++) {
                        TreeNode node = sumTree(a.get(i), left.get(k), right.get(l));
                        treeList.add(node);
                    }
                }
            }
        }

     //   putCache(startNum, endNum, treeList);
        return treeList;
    }

    private static void putCache(int startNum, int endNum, ArrayList<TreeNode> treeNodes) {
        int key = getKey(startNum, endNum);

        CACHE.put(key, treeNodes);
    }

    private static ArrayList<TreeNode> getCache(int startNum, int endNum) {
        int key = getKey(startNum, endNum);

        return CACHE.get(key);
    }

    private static int getKey(int startNum, int endNum) {
        return startNum * 10000 + endNum;
    }

    private TreeNode sumTree(Integer integer, TreeNode left, TreeNode right) {
        TreeNode tn = new TreeNode(integer);
        tn.left = left;
        tn.right = right;
        return tn;
    }

    public ArrayList<TreeNode> generateTrees(int a) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 1; i <= a; i++)
            b.add(i);

        return recur(b,0,b.size());
    }
}


public class CheckpointLevel7UniqueBinarySearchTrees {
    public static void main(String[] arg) {
        Solution sol = new Solution();
        System.out.println(sol.generateTrees(3));
    }
}
