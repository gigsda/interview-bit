package test1.tree;

/**
 * Created by 1100383 on 2017. 4. 10..
 */

class Solution6 {
    /////////////
    class Tail {
        int a = -1;
        int b = -1;
        int c = -1;

        public Tail(int val1, int i, int cc) {
            a = val1;
            b = i;
            c = cc;
        }
    }

    private Tail recur(TreeNode a, int val1, int val2) {

        Tail tt = new Tail(-1, -1, -1);
        Tail t1 = new Tail(-1, -1, -1), t2 = new Tail(-1, -1, -1);;

        if (a == null)
            return new Tail(-1, -1, -1);

        if (a.right != null)
            t1 = recur(a.right, val1, val2);

        if (a.left != null)
            t2 = recur(a.left, val1, val2);

        if (a.val == val1)
            tt.a = val1;

        if (a.val == val2)
            tt.b = val2;

        int aa = -1;
        int bb = -1;
        int cc = -1;

        aa = (tt.a != -1) ? tt.a : t1.a;
        aa = (aa != -1) ? aa : t2.a;

        bb = (tt.b != -1) ? tt.b : t1.b;
        bb = (bb != -1) ? bb : t2.b;

        cc = (t1.c != -1) ? t1.c : t2.c;

        if (aa != -1 && bb != -1 && cc == -1)
            cc = a.val;

        return new Tail(aa, bb, cc);
    }

    public int lca(TreeNode a, int val1, int val2) {

        Tail tail = recur(a, val1, val2);

        return tail.c;
    }

}

public class LeastCommonAncestorBookmarkSuggestEdit {
    public static void main(String[] arg) {
        Solution6 sol = new Solution6();

       /* TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(5);
        TreeNode a3 = new TreeNode(1);
        TreeNode a4 = new TreeNode(6);
        TreeNode a5 = new TreeNode(2);
        TreeNode a6 = new TreeNode(7);
        TreeNode a7 = new TreeNode(4);
        TreeNode a8 = new TreeNode(0);
        TreeNode a9 = new TreeNode(8);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a5.left = a6;
        a5.right = a7;
        a3.left = a8;
        a3.right = a9;*/

        TreeNode a1 = new TreeNode(1);
        System.out.println(sol.lca(a1, 1, 1));
    }
}
