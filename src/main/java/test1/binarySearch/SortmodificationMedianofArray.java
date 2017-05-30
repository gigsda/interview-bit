package test1.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution5 {
    /////////////

/*    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        recur((n - m) / 2,(m + n) / 2)
        return 0L;
    }
*/
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        List<Integer> A = a, B = b, lstT = null;

        if (b.size() > a.size()) {
            lstT = A;
            A = b;
            B = lstT;
        }

        int n = A.size(), m = B.size();

        if (m == 0)
            if (n % 2 == 1)
                return A.get(n / 2);
            else
                return ((double) A.get(n / 2) + A.get(n / 2 - 1)) / 2;

        int low = (n - m) / 2;
        int high = (m + n) / 2;
        double maxL = 0, minR = 0;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n) / 2 - i;

           if (j - 1 == -1)
                maxL = A.get(i - 1);
            else
                maxL = Math.max(A.get(i - 1), B.get(j - 1));

            if (j == m)
                minR = A.get(i);
            else
                minR = Math.min(A.get(i), B.get(j));

            if (maxL <= minR)
                break;

            // i decase
            if (j != m && (i < 0 || B.get(j) < A.get(i - 1)))
                high = i - 1;
                // i incrase
            else if (i != n && (j < 0 || A.get(i) < B.get(j - 1)))
                low = i + 1;
        }

        if ((m + n) % 2 == 1)
            return minR;
        else
            return ((double) minR + maxL) / 2;

    }

}

public class SortmodificationMedianofArray {
    public static void main(String[] arg) {
        Solution5 sol = new Solution5();

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(
                        Arrays.asList(0, 23)),
                new ArrayList<Integer>(Arrays.asList())) == 11.5);

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(
                        Arrays.asList(-34, -28, -12, 1)),
                new ArrayList<Integer>(Arrays.asList(-50, -44, -7, -5, -2, 0, 7, 7, 42))) == -5.0);

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(
                        Arrays.asList(-43, -25, -18, -15, -10, 9, 39, 40)),
                new ArrayList<Integer>(Arrays.asList(-2))) == -10.0);

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(
                        Arrays.asList(-40, -25, 5, 10, 14, 28, 29, 48)),
                new ArrayList<Integer>(Arrays.asList(-48, -31, -15, -6, 1, 8))) == 3.0);

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(
                        Arrays.asList(-50, -47, -36, -35, 0, 13, 14, 16)),
                new ArrayList<Integer>(Arrays.asList(-31, 1, 9, 23, 30, 39))) == 5.0);

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(Arrays.asList(-50, -41, -40, -19, 5, 21, 28)),
                new ArrayList<Integer>(Arrays.asList(-50, -21, -10))) == -20.0);

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(Arrays.asList()),
                new ArrayList<Integer>(Arrays.asList(20))) == 20.0);

        System.out.println(sol.findMedianSortedArrays(
                new ArrayList<Integer>(Arrays.asList(1, 4, 5)),
                new ArrayList<Integer>(Arrays.asList(2, 3))) == 3.0);

    }
}
