package test1.math;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution {
    public int gcd(int a, int b) {
        int t = (a > b)?b:a;

        for (int i = t; t >= 1; t--){

            if (a%t==0 && b%t==0)
                return t;
        }

        return (a < b)?b:a;
    }
}

public class GreatestCommonDivisor {
    public static void main(String [ ] arg) {
         Solution sol = new Solution();
         System.out.println(sol.gcd(2,0));
    }
}
