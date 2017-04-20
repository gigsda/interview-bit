package test1.linkedlist;

import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    /////////////
    public ListNode deleteDuplicates(ListNode a) {
        if (a == null)
            return null;

        if (a.next == null)
            return a;

        ListNode cur = a.next;
        while (cur != null){

            if (cur.next != null) {
                while (cur.next.val == cur.val ) {
                    cur.next = cur.next.next;
                    if (cur.next == null)
                        break;
                }
            }

            cur = cur.next;
        }

        return a;
    }

////////////
}

public class LinkedListsRemoveDuplicatesFromSortedList {
    public static void main(String[] arg) {
        Solution sol = new Solution();
        ListNode a = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(4);
        a.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        System.out.println(sol.deleteDuplicates(a));

        return;
    }
}
