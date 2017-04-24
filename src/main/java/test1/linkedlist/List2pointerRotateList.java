package test1.linkedlist;

import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution6 {
/////////////
public ListNode rotateRight(ListNode a, int b) {
    ListNode head = new ListNode(-1);

    if (a == null)
        return a;

    head.next = a;
    int n = 0;

    ListNode cur = head.next;
    ListNode prv = head;

    while (cur != null){
        n++;
        prv = cur;
        cur = cur.next;
    }

    prv.next = head.next;

    cur = head.next;
    b %= n;

    for(int i = 0;i < n-b-1; i++){
        cur = cur.next;
    }
    head.next = cur.next;
    cur.next = null;

    return head.next;
}

////////////
}

public class List2pointerRotateList {
    public static void main(String[] arg) {
        Solution6 sol = new Solution6();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;


        ListNode t = sol.rotateRight(n1,3);;
        while (t!= null){
            System.out.print(t.val+"->");
            t = t.next;
        }
    }
}
