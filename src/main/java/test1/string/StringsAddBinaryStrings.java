package test1.string;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution6 {
    /////////////
    public String addBinary(String a, String b) {


        int k = Math.max(a.length(), b.length());
        char cc[] = new char[k + 1];
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int carry = 0;

        while (i >= 0 || j >= 0 || k >= 0) {

            sum = carry;

            if (i >= 0)
                sum += a.charAt(i) - '0';

            if (j >= 0)
                sum += b.charAt(j) - '0';



            cc[k] = (char) ((sum % 2) + '0');
            carry = sum / 2;

            i--;
            j--;
            k--;
        }

        if (cc[0] == '0')
            return new String(cc).substring(1, cc.length);
        else
            return new String(cc);
    }

////////////
// 101111000100100111001010101001110100001100001010110011100100011010100000
// 101111000100100111001010101001110100001100001010110011100100011010100000
}

public class StringsAddBinaryStrings {
    public static void main(String[] arg) {
        Solution6 sol = new Solution6();


        System.out.println(sol.addBinary("1111", "11"));
        System.out.println(sol.addBinary("1111", "1111"));

        System.out.println(sol.addBinary("10001100010111000101100010100110001001101010000010011010", "101111000100100100111110010010101110101001100100101001111010011000000110"));
    }
}
