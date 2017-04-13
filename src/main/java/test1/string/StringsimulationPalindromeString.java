package test1.string;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution2 {
/////////////

    public int isPalindrome(String a) {

        int left = 0;
        int right = a.length()-1;
        a = a.toLowerCase();
        char tmp[] = new char[a.length()];
        int k = 0;

        String b="";
        for (int i = 0;i < a.length(); i++)
            if ('a' <= a.charAt(i) && a.charAt(i) <= 'z' || '0' <= a.charAt(i) && a.charAt(i) <= '9')
                tmp[k++] = a.charAt(i);

        for (int i = 0;i < k/2; i++){
            if (tmp[i] != tmp[k-i-1])
                return 0;
        }
        return 1;
    }
////////////
}

public class StringsimulationPalindromeString {
    public static void main(String [ ] arg) {
         Solution2 sol = new Solution2();
        System.out.println(sol.isPalindrome("a  adaa???"));
    }
}
