package test1.dynamic;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
/////////////

    public int climbStairs(int a) {

        if (a <= 2)
            return a;

        int dp[] = new int[a];

        dp[a-1] = 1;
        dp[a-2] = 2;

        for(int i =a-3; i>= 0; i--){
            dp[i] = dp[i+1]+dp[i+2];
        }
        return dp[0];
    }
////////////
}

public class SimplearraydpStairs {
    public static void main(String[] arg) {
        Solution sol = new Solution();

        System.out.println(sol.climbStairs(4));
    }
}
