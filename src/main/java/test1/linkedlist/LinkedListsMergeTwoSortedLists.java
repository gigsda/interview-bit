package test1.linkedlist;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode n = new ListNode(0);

        ListNode cn = n;

        while (a != null && b != null) {

            if (a.val <= b.val) {
                cn.next = a;
                cn = cn.next;
                a = a.next;
            } else  {
                cn.next = b;
                cn = cn.next;
                b = b.next;
            }
        }

        if (a == null)
            cn.next = b;
        else
            cn.next = a;

        return n.next;
    }
}

public class LinkedListsMergeTwoSortedLists {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();
        System.out.println(sol.mergeTwoLists(new ListNode(1), new ListNode(1)));
        return;
    }
}
