package test1.dynamic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution5 {
/////////////
public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> a) {
    int ni = a.size();
    int nj = a.get(0).size();

    int dp[][] = new int[ni + 1][nj + 1];

    for (int i = 0; i <= ni; i++)
        for (int j = 0; j <= nj; j++)
            dp[i][j] = 0;

    if (a.get(ni-1).get(nj-1) == 1)
        return 0;

    dp[ni][nj - 1] = 1;

    for (int i = ni - 1; i >= 0; i--)
        for (int j = nj - 1; j >= 0; j--)
        if (a.get(i).get(j) == 0){

            dp[i][j] =   dp[i+1][j] + dp[i][j+1];
        }

    return dp[0][0];
}

////////////
}

public class MatrixdpUniquePathsinaGrid {
    public static void main(String[] arg) {
        Solution5 sol = new Solution5();
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(0,0)));
        mat.add(new ArrayList<>(Arrays.asList(0,0)));
        mat.add(new ArrayList<>(Arrays.asList(0,0)));
        mat.add(new ArrayList<>(Arrays.asList(1,0)));
        mat.add(new ArrayList<>(Arrays.asList(0,0)));


        System.out.println(sol.uniquePathsWithObstacles(mat));
    }
}
