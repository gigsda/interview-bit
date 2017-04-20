package test1.linkedlist;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
    /////////////
    public ListNode addTwoNumbers(ListNode a, ListNode b) {

        ListNode n = new ListNode(0);
        ListNode cn = n;

        int carry = 0;

        while (a != null || b != null || carry == 1) {
            int va = 0;
            int vb = 0;

            if (a != null) va = a.val;
            if (b != null) vb = b.val;

            cn.next = new ListNode((va + vb + carry) % 10);
            if (va + vb + carry >= 10)
                carry = 1;
            else carry = 0;

            if (a != null) a = a.next;
            if (b != null) b = b.next;

            cn = cn.next;
        }


        return n.next;
    }

////////////
}

public class LinkedListsAddTwoNumbersAsLists {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();
        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(1);

        a1.next = a2;
        a2.next = a3;
        ListNode b1 = new ListNode(1);


        System.out.println(sol.addTwoNumbers(a1, b1));
    }
}
