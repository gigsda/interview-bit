package test1.linkedlist;

import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution5 {
/////////////
public ListNode swapPairs(ListNode a) {

    ListNode head = new ListNode(-1);
    head.next = a;

    ListNode cur = a;
    ListNode prv = head;

    if (cur == null) return null;
    if (cur.next == null)
        return head.next;

    while(cur != null){

         ListNode t = cur.next;
        prv.next = t;
        cur.next = t.next;
        t.next = cur;

        cur = t;
        if(cur.next.next == null)break;
        if(cur.next.next.next == null)break;
        prv = prv.next.next;
        cur = cur.next.next;
    }

    return head.next;
}

////////////
}

public class PointermoveSwapListNodesinpairs {
    public static void main(String[] arg) {
        Solution5 sol = new Solution5();

        System.out.println(sol);
    }
}
