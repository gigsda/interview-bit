package test1.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution444 {
    /////////////


    public int books(ArrayList<Integer> a, int b) {
        for (int i = 1; i < a.size(); i++)
            a.set(i, a.get(i - 1) + a.get(i));

        recur(a, 0, a.size(), b - 1, 0, Integer.MIN_VALUE);
        if (minshare == Integer.MAX_VALUE)
            return -1;
        return minshare;
    }

    int minshare = Integer.MAX_VALUE;

    private void recur(List<Integer> a, int s, int n, int b, int prv, int curshare) {

        int pvalue = (a.get(n - 1) - prv) / (b + 1);
        if (curshare >= minshare) return;
        if (minshare < pvalue)
            return;

        if (b == 0) {
            if (a.get(n - 1) - prv > curshare)
                curshare = a.get(n - 1) - prv;
            if (minshare > curshare)
                minshare = curshare;
            return;
        }

        for (int i = s + 1; i < n; i++) {
            int ncurshare = curshare;
            if (a.get(i - 1) - prv > ncurshare)
                ncurshare = a.get(i - 1) - prv;

            recur(a, i, n, b - 1, a.get(i - 1), ncurshare);
        }
    }

////////////98, 92, 33, 62, 76, 36, 46, 73, 64, 84, 92, 19, 42, 28, 59, 62, 45, 16, 27, 72, 48, 0, 70, 98, 92, 45, 28, 0, 43, 92
// 26
//
// 98
    // 73, 58, 30, 72, 44, 78, 23, 9
    // 5
    //110

}

class Solution4 {
    public int books(ArrayList<Integer> a, int b) {
        int sum = 0;
        if (a.size() < b) return -1;
        for (int i = 0; i < a.size(); i++)
            sum += a.get(i);
        int tmax = Integer.MAX_VALUE;
        int start = 0;
        int end = sum;

        int hyperSum = sum / 2;

        while (true) {
            int max = -1;
            int cnt = 0;
            int tmp = a.get(0);

            for (int i = 1; i < a.size(); i++) {
                if (tmp + a.get(i) >= hyperSum) {

                    if (max < tmp)
                        max = tmp;
                    if (tmp + a.get(i) == hyperSum) {
                        if (max < tmp + a.get(i))
                            max = tmp + a.get(i);
                        tmp = 0;
                    } else
                        tmp = a.get(i);
                    cnt++;
                } else
                    tmp += a.get(i);
            }
            if (tmp > 0) {
                if (max < tmp)
                    max = tmp;
                cnt++;
            }

            if (cnt == b)
                if (tmax > max)
                    tmax = max;

            if (end - start <= 1) {
                return tmax;
            } else if (cnt > b) {
                start = hyperSum;
                hyperSum += ( end-start) / 2;
            } else if (cnt <= b) {
                end = hyperSum;
                hyperSum -= (end-start) / 2;
            }

        }

    }
}

public class AllocateBooks {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();
        System.out.println(sol.books(new ArrayList<>(Arrays.asList(79, 83, 70, 40, 23, 50, 71, 29, 18, 46, 99, 30 )), 1));
// / 638

        System.out.println(sol.books(new ArrayList<>(Arrays.asList(87, 3, 27, 29, 40, 12, 3, 69, 9, 57, 60, 33, 99 )), 3));
        //192

        System.out.println(sol.books(new ArrayList<>(Arrays.asList(73, 58, 30, 72, 44, 78, 23, 9)), 5));
        //110

        System.out.println(sol.books(new ArrayList<>(Arrays.asList(53, 83, 47, 7, 73, 22, 5, 76, 53, 24 )), 6));

        //
        System.out.println(sol.books(new ArrayList<>(Arrays.asList(73, 58, 30, 72, 44, 78, 23, 9)), 5));

        System.out.println(sol.books(new ArrayList<>(Arrays.asList(98, 92, 33, 62, 76, 36, 46, 73, 64, 84, 92, 19, 42, 28, 59, 62, 45, 16, 27, 72, 48, 0, 70, 98, 92, 45, 28, 0, 43, 92)), 26));
        System.out.println(sol.books(new ArrayList<>(Arrays.asList(12, 34, 67, 90)), 2));
        System.out.println(sol.books(new ArrayList<>(Arrays.asList(22)), 1));
    }
}
