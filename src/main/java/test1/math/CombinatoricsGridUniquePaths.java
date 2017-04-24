package test1.math;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution7 {
    /////////////
    public int uniquePaths(int a, int b) {
        int l = a + b - 1;

        int pv[] = new int[1];
        pv[0] = 1;

        for (int i = 0; i < l; i++) {

            int ar[] = new int[i + 1];
            ar[0] = 1;

            for (int j = 1; j <= i; j++) {
                int t = 0,t1=0;
                if (j - 1 >= 0)
                    t = pv[j - 1];
                if (j < i)
                    t1 = pv[j];

                ar[j] = t + t1;
            }

            pv = ar;

        }

        return pv[Math.min(a-1, b-1)];
    }

////////////
}

public class CombinatoricsGridUniquePaths {
    public static void main(String[] arg) {
        Solution7 sol = new Solution7();
     //   System.out.println(sol.uniquePaths(3, 3));
    //    System.out.println(sol.uniquePaths(1, 1));
     //   System.out.println(sol.uniquePaths(2, 1));
      //  System.out.println(sol.uniquePaths(1, 2));
        System.out.println(sol.uniquePaths(2, 2));
    }
}
