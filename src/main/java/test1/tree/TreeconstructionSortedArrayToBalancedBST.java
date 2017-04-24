package test1.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution11 {
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        return recur(a);
    }

    private TreeNode recur(List<Integer> a) {

        if (a.size() == 0)
            return null;
        int c = a.size() / 2;

        int li = c - 1;
        int ri = c + 1;

        TreeNode node = new TreeNode(a.get(c).intValue());

        if (li >= 0)
            node.left = recur(a.subList(0, c));
        if (ri < a.size())
            node.right = recur(a.subList(c + 1, a.size()));

        return node;
    }

////////////
}

public class TreeconstructionSortedArrayToBalancedBST {
    public static void main(String[] arg) {
        Solution11 sol = new Solution11();
        TreeNode test1 = sol.sortedArrayToBST(new ArrayList<>(Arrays.asList(1,2,3,4,100,101,102,103,104,105,106,107)));
       // BTreePrinter.printNode(test1);
        TreePrinter.print(test1);
        System.out.println(test1);
    }
}
