package test1.linkedlist;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
/////////////
    // 현재와 b 번째 앞에 포인터를 위치 시키고 동시에 전진해 앞포인터가 널이면 종료

public ListNode removeNthFromEnd(ListNode a, int b) {
    int n = 0;

    ListNode head = new ListNode(-1);
    head.next = a;

    ListNode cur = a;

    while(cur != null){
        n++;
        cur = cur.next;
    }

    if (n == 1)
        return null;

    if (b > n)b = n;

    cur = head;
    for(int i = 0;i <= n-b-1; i++){
        cur = cur.next;
    }

    cur.next = cur.next.next;

    return head.next;
}

////////////
}

public class List2pointerRemoveNthNodefromListEnd {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        System.out.println(sol.removeNthFromEnd(n1,3));
    }
}
