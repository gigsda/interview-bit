package test1.heapsandmaps;

import javafx.collections.transformation.SortedList;

import java.util.*;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    public int nchoc(int A, ArrayList<Integer> c) {

        PriorityQueue<Integer> B = new PriorityQueue<Integer>();
        c.forEach(el->B.add(el*-1));

        Long sum = 0L;
        int t;

        for (int i = 0;i < A; i++) {

            t = B.poll();
            sum += (t*-1);
            sum = sum%(1000000007L);
            B.add(t/2);

        }
        return sum.intValue();
    }


}

public class MagicianandChocolatesBookmarkSuggestEdit {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();

        System.out.println(sol.nchoc(3,new ArrayList<Integer>(Arrays.asList( 6, 5))));
        System.out.println(sol.nchoc(10,new ArrayList<Integer>(Arrays.asList( 2147483647, 2000000014, 2147483647))));

    }
}
