package test1.bitmanipulation;

/**
 * Created by 1100383 on 2017. 4. 10..
 */


class Solution3 {
    /////////////
    public long reverse2(long a) {
        String bits = "00000000000000000000000000000000";
        String bs = Long.toBinaryString(a);
        bits = bits.substring(0, bits.length() - bs.length()) + bs;
        StringBuilder sb = new StringBuilder().append(bits).reverse();

        return Long.parseLong(sb.toString(), 2);
    }

    public long reverse(long A) {
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            if ((A & (1 << i)) != 0)
                rev |= 1;
        }

        return rev;
    }
////////////
}

public class BitplayReverseBits {
    public static void main(String[] arg) {
        Solution3 sol = new Solution3();
        System.out.println(sol.reverse(2));
        System.out.println(sol.reverse(3));
    }
}
//00000000000000000000000000000000