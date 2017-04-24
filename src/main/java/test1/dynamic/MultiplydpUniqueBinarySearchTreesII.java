package test1.dynamic;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution6 {
/////////////
public int numTrees(int a) {
    if (a == 0)
        return 0;

    int dp[] = new int[a+1];
    dp[0] = 1;
    dp[1] = 1;

    for(int i = 2;i <= a; i++){
        for(int j = 0;j < i; j++){
            dp[i] += dp[j]*dp[i-j-1];
        }
    }

    return dp[a];

}
////////////
}

public class MultiplydpUniqueBinarySearchTreesII {
    public static void main(String[] arg) {
        Solution6 sol = new Solution6();



        System.out.println(sol.numTrees(4));
        System.out.println(sol.numTrees(3));


        System.out.println(sol.numTrees(5));
        System.out.println(sol.numTrees(0));
        System.out.println(sol.numTrees(1));
        System.out.println(sol.numTrees(2));

    }
}
