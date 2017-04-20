package test1.dynamic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
    /////////////
    public int minPathSum(ArrayList<ArrayList<Integer>> a) {
        int ni = a.size();
        int nj = a.get(0).size();

        int dp[][] = new int[ni + 1][nj + 1];

        for (int i = 0; i < ni; i++)
            for (int j = 0; j < nj; j++)
                dp[i][j] = 0;

        for (int i = 0; i < ni + 1; i++)
            dp[i][nj]  = Integer.MAX_VALUE / 2;

        for (int j = 0; j < nj + 1; j++)
           dp[ni][j] = Integer.MAX_VALUE / 2;

        dp[ni][nj - 1] = 0;

        for (int i = ni - 1; i >= 0; i--)
            for (int j = nj - 1; j >= 0; j--) {
                dp[i][j] = a.get(i).get(j) + Math.min(dp[i][j + 1], dp[i + 1][j]);
            }

        return dp[0][0];
    }

////////////
}

public class MatrixdpMinSumPathinMatrix {
    public static void main(String[] arg) {
        Solution2 sol = new Solution2();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(20, 29, 84, 4, 32, 60, 86, 8, 7, 37)));
        mat.add(new ArrayList<>(Arrays.asList(77, 69, 85, 83, 81, 78, 22, 45, 43, 63)));
        mat.add(new ArrayList<>(Arrays.asList(60, 21, 0, 94, 59, 88, 9, 54, 30, 80)));
        mat.add(new ArrayList<>(Arrays.asList(40, 78, 52, 58, 26, 84, 47, 0, 24, 60)));
        mat.add(new ArrayList<>(Arrays.asList(40, 17, 69, 5, 38, 5, 75, 59, 35, 26)));
        mat.add(new ArrayList<>(Arrays.asList(64, 41, 85, 22, 44, 25, 3, 63, 33, 13)));
        mat.add(new ArrayList<>(Arrays.asList(2, 21, 39, 51, 75, 70, 76, 57, 56, 22)));
        mat.add(new ArrayList<>(Arrays.asList(31, 45, 47, 100, 65, 10, 94, 96, 81, 14)));
      /*  mat.add(new ArrayList<>(Arrays.asList(1,3,2)));
        mat.add(new ArrayList<>(Arrays.asList(4,3,1)));
        mat.add(new ArrayList<>(Arrays.asList(5,6,1)));*/

        System.out.println(sol.minPathSum(mat));
    }
}
