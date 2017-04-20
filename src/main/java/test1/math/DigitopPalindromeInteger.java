package test1.math;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution4 {
    /////////////
    public boolean isPalindrome(int a) {
        int rev = 0, b = a;
        if (a < 0) return false;
        while (a > 0) {
            rev = a % 10 + rev * 10;
            a /= 10;
        }

        return (b == rev);
    }
////////////
}

public class DigitopPalindromeInteger {
    public static void main(String[] arg) {
        Solution4 sol = new Solution4();

//          System.out.println(sol.isPalindrome(0));
//            System.out.println(sol.isPalindrome(1));
//          System.out.println(sol.isPalindrome(1221));
//         System.out.println(sol.isPalindrome(2147447412));

        //       System.out.println(sol.isPalindrome(202));
//        System.out.println(sol.isPalindrome(12021));
//        System.out.println(sol.isPalindrome(12020021));
//        System.out.println(sol.isPalindrome(20));
//        System.out.println(sol.isPalindrome(12));
//        System.out.println(sol.isPalindrome(2212));
//        System.out.println(sol.isPalindrome(123421));


    }
}
