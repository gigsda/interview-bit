package test1.Graphs;


import test1.ListNode;
import test1.TreeNode;
import test1.TreePrinter;

import java.util.ArrayList;
import java.util.Arrays;

class Solution3 {
    /////////////
    ListNode head = null,cur = null;
    public TreeNode sortedListToBST(ListNode a) {
        int cnt = 0;
        head = cur = a;
        ListNode t = a;
        while (t != null) {
            t = t.next;
            cnt++;
        }

        return recur(cnt);
    }

    private TreeNode recur(int a) {

        if (a == 0)
            return null;

        TreeNode tn =  new TreeNode(cur.val);
        tn.left = recur(a/2);
        tn.val = cur.val;
         cur = cur.next;
        tn.right = recur(a-a/2-1);
        return tn;
    }

////////////
}

public class GraphadhocConvertSortedListtoBinarySearchTree {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();



        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1)))));
        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1,2)))));
        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1,2,3,4)))));
        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)))));
        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6)))));
        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7)))));
        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8)))));
        TreePrinter.print(sol.sortedListToBST(makeList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)))));


    }

    private static ListNode makeList(ArrayList<Integer> integers) {
        ListNode head = new ListNode(-1);
        ListNode t = head;
        for(Integer a : integers){
            t.next = new ListNode(a);
            t = t.next;
        }
        return head.next;
    }
}
